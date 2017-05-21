package com.mickamy.qiitaviewer;

import com.google.gson.annotations.SerializedName;

import org.threeten.bp.OffsetDateTime;

import java.util.List;

public final class QiitaItem {

    public final String renderedBody;

    public final String body;

    @SerializedName("coediting")
    public final boolean isCoediting;

    public final OffsetDateTime createdAt;

    public final QiitaGroup group;

    public final String id;

    @SerializedName("private")
    public final boolean isPrivate;

    public final List<QiitaTag> tags;

    public final String title;

    public final OffsetDateTime updatedAt;

    public final String url;

    public final QiitaUser user;

    public QiitaItem(String renderedBody, String body, boolean isCoediting, OffsetDateTime createdAt, QiitaGroup group, String id, boolean isPrivate, List<QiitaTag> tags, String title, OffsetDateTime updatedAt, String url, QiitaUser user) {
        this.renderedBody = renderedBody;
        this.body = body;
        this.isCoediting = isCoediting;
        this.createdAt = createdAt;
        this.group = group;
        this.id = id;
        this.isPrivate = isPrivate;
        this.tags = tags;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.user = user;
    }

    @Override
    public String toString() {
        return "QiitaItem{" +
                "renderedBody='" + renderedBody + '\'' +
                ", body='" + body + '\'' +
                ", isCoediting=" + isCoediting +
                ", createdAt=" + createdAt +
                ", group=" + group +
                ", id='" + id + '\'' +
                ", isPrivate=" + isPrivate +
                ", tags=" + tags +
                ", title='" + title + '\'' +
                ", updatedAt=" + updatedAt +
                ", url='" + url + '\'' +
                ", user=" + user +
                '}';
    }
}
