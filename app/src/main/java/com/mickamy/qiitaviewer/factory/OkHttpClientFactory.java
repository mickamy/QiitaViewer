package com.mickamy.qiitaviewer.factory;

import okhttp3.OkHttpClient;

public class OkHttpClientFactory {

    public static OkHttpClient makeClient() {
        return new OkHttpClient.Builder()
                .build();
    }
}
