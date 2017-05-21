package com.mickamy.qiitaviewer.repository;

import com.mickamy.qiitaviewer.dto.QiitaItem;
import com.mickamy.qiitaviewer.factory.ServiceFactory;

import java.util.List;

import io.reactivex.Single;

public class QiitaRepository implements IQiitaRepository {

    private static QiitaRepository instance;

    private final Service service;

    public static QiitaRepository getInstance() {
        if (instance == null) {
            instance = new QiitaRepository(ServiceFactory.makeQiitaService());
        }
        return instance;
    }

    private QiitaRepository(Service service) {
        this.service = service;
    }

    @Override
    public Single<List<QiitaItem>> getItems(String query) {
        return service.getItems(query);
    }
}
