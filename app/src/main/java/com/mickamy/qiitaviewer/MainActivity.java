package com.mickamy.qiitaviewer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

import com.mickamy.qiitaviewer.repository.QiitaRepository;

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
        return super.onCreateOptionsMenu(menu);
    }
}
