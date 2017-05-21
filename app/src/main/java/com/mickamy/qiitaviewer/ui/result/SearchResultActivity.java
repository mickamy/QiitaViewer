package com.mickamy.qiitaviewer.ui.result;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.mickamy.qiitaviewer.R;
import com.mickamy.qiitaviewer.dto.QiitaItem;
import com.mickamy.qiitaviewer.repository.QiitaRepository;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class SearchResultActivity extends AppCompatActivity implements SearchResultController.AdapterCallback {
    @SuppressWarnings("unused")
    private static final String TAG = SearchResultActivity.class.getSimpleName();

    private static final String KEY_QUERY = "query";

    private SearchResultController controller = new SearchResultController(this);

    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    public static Intent createIntent(Context context, String query) {
        Intent intent = new Intent(context, SearchResultActivity.class);
        intent.putExtra(KEY_QUERY, query);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        ButterKnife.bind(this);

        configureRecycler();

        QiitaRepository.getInstance().getItems(getIntent().getStringExtra(KEY_QUERY))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        this::present,
                        Throwable::printStackTrace
                );
    }

    private void configureRecycler() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(controller.getAdapter());
    }

    private void present(List<QiitaItem> response) {
        controller.setData(response);
    }

    @Override
    public void onClickItem(QiitaItem clicked) {
        Log.d(TAG, "onClickItem: " + clicked.title);
    }
}
