package com.mickamy.qiitaviewer.ui.base;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;

public abstract class LoadableActivity extends AppCompatActivity {

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    protected void enableLoadingView(boolean loading) {
        getLoadingView().setVisibility(loading ? View.VISIBLE : View.GONE);
        getContentView().setVisibility(loading ? View.INVISIBLE : View.VISIBLE);
    }

    protected abstract View getContentView();

    protected abstract View getLoadingView();
}
