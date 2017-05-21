package com.mickamy.qiitaviewer.repository;

import com.mickamy.qiitaviewer.dto.QiitaItem;
import com.mickamy.qiitaviewer.repository.IQiitaRepository;

import java.util.List;

import io.reactivex.Single;

public class QiitaRepository implements IQiitaRepository {

    private final Service service;

    public QiitaRepository(Service service) {
        this.service = service;
    }

    @Override
    public Single<List<QiitaItem>> getItems(String query) {
        return service.getItems(query);
    }
}
