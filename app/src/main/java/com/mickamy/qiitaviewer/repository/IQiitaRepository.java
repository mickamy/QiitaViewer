package com.mickamy.qiitaviewer.repository;

import com.mickamy.qiitaviewer.dto.QiitaItem;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Query;

public interface IQiitaRepository {

    Single<List<QiitaItem>> getItems(
            String query
    );

    interface Service {

        Single<List<QiitaItem>> getItems(
                @Query("query") String query
        );
    }
}
