package com.mickamy.qiitaviewer.ui.result;

import com.airbnb.epoxy.TypedEpoxyController;
import com.mickamy.qiitaviewer.dto.QiitaItem;

import java.util.List;

class SearchResultController extends TypedEpoxyController<List<QiitaItem>> {

    private final AdapterCallback callback;

    SearchResultController(AdapterCallback callback) {
        this.callback = callback;
        setDebugLoggingEnabled(true);
    }

    @Override
    protected void buildModels(List<QiitaItem> data) {
        for (QiitaItem item : data) {
            add(new QiitaItemModel_()
                    .id(item.id)
                    .title(item.title)
                    .createdAt(item.createdAt)
                    .onClickListener((model, parentView, clickedView, position) -> {
                        callback.onClickItem(item);
                    })
            );
        }
    }

    interface AdapterCallback {
        void onClickItem(QiitaItem clicked);
    }
}
