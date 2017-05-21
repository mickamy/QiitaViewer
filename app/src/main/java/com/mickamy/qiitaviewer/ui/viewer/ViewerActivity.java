package com.mickamy.qiitaviewer.ui.viewer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.mickamy.qiitaviewer.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewerActivity extends AppCompatActivity {

    private static final String KEY_URL = "url";

    @BindView(R.id.webview)
    WebView webView;

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

        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());

        webView.loadUrl(getIntent().getStringExtra(KEY_URL));
    }
}
