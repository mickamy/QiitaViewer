package com.mickamy.qiitaviewer.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;

import com.mickamy.qiitaviewer.R;
import com.mickamy.qiitaviewer.repository.QiitaRepository;
import com.mickamy.qiitaviewer.ui.result.SearchResultActivity;

import io.reactivex.android.schedulers.AndroidSchedulers;

public class MainActivity extends AppCompatActivity {
    @SuppressWarnings("unused")
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QiitaRepository.getInstance().getItems("android")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        response -> Log.d(TAG, "onCreate: " + response),
                        throwable -> throwable.printStackTrace()
                );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.search_menu_search_view).getActionView();
        searchView.setOnQueryTextListener(searchViewListener);
        return super.onCreateOptionsMenu(menu);
    }

    private final SearchView.OnQueryTextListener searchViewListener = new SearchView.OnQueryTextListener() {
        @Override
        public boolean onQueryTextSubmit(String query) {
            Log.d(TAG, "onQueryTextSubmit: " + query);
            startActivity(SearchResultActivity.createIntent(MainActivity.this, query));
            return true;
        }

        @Override
        public boolean onQueryTextChange(String newText) {
            return false;
        }
    };
}
