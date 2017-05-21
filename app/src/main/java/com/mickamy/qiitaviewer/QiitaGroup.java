package com.mickamy.qiitaviewer;

import com.google.gson.annotations.SerializedName;

import org.threeten.bp.OffsetDateTime;

public final class QiitaGroup {

    public final OffsetDateTime createdAt;

    public final long id;

    public final String name;

    @SerializedName("private")
    public final boolean isPrivate;

    public final OffsetDateTime updatedAt;

    public final String urlName;

    public QiitaGroup(OffsetDateTime createdAt, long id, String name, boolean isPrivate, OffsetDateTime updatedAt, String urlName) {
        this.createdAt = createdAt;
        this.id = id;
        this.name = name;
        this.isPrivate = isPrivate;
        this.updatedAt = updatedAt;
        this.urlName = urlName;
    }

    @Override
    public String toString() {
        return "QiitaGroup{" +
                "createdAt=" + createdAt +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", isPrivate=" + isPrivate +
                ", updatedAt=" + updatedAt +
                ", urlName='" + urlName + '\'' +
                '}';
    }
}
