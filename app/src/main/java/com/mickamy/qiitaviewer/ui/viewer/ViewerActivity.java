package com.mickamy.qiitaviewer.ui.viewer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.mickamy.qiitaviewer.R;
import com.mickamy.qiitaviewer.ui.base.LoadableActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewerActivity extends LoadableActivity {

    private static final String KEY_URL = "url";

    @BindView(R.id.webview)
    WebView webView;

    @BindView(R.id.progress)
    ProgressBar progressBar;

    public static Intent createIntent(Context context, String url) {
        Intent intent = new Intent(context, ViewerActivity.class);
        intent.putExtra(KEY_URL, url);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);
        ButterKnife.bind(this);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                enableLoadingView(true);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                enableLoadingView(false);
            }
        });

        webView.loadUrl(getIntent().getStringExtra(KEY_URL));
    }

    @Override
    protected View getContentView() {
        return webView;
    }

    @Override
    protected View getLoadingView() {
        return progressBar;
    }
}
