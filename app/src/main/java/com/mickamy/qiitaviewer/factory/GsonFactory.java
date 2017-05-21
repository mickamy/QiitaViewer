package com.mickamy.qiitaviewer.factory;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonFactory {

    public static Gson makeGson() {
        return new GsonBuilder()
        // TODO: 2017/05/21 OffsetDateTime parser
//                .registerTypeAdapter()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
    }
}
