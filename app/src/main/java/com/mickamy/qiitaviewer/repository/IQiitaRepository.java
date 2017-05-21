package com.mickamy.qiitaviewer.repository;

import com.mickamy.qiitaviewer.dto.QiitaItem;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IQiitaRepository {

    Single<List<QiitaItem>> getItems(
            String query
    );

    interface Service {

        @GET("items")
        Single<List<QiitaItem>> getItems(
                @Query("query") String query
        );
    }
}
