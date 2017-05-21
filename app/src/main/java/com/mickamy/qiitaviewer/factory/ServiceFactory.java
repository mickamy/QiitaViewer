package com.mickamy.qiitaviewer.factory;

import com.mickamy.qiitaviewer.repository.QiitaRepository;

import retrofit2.Retrofit;

public class ServiceFactory {

    public static QiitaRepository.Service makeQiitaService(Retrofit retrofit) {
        return retrofit.create(QiitaRepository.Service.class);
    }

    public static QiitaRepository.Service makeQiitaService() {
        return makeQiitaService(RetrofitFactory.makeRetrofit());
    }
}
