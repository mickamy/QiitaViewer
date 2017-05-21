package com.mickamy.qiitaviewer.dto;

import java.util.List;

public final class QiitaTag {

    public final String name;

    public final List<String> versions;

    public QiitaTag(String name, List<String> versions) {
        this.name = name;
        this.versions = versions;
    }

    @Override
    public String toString() {
        return "QiitaTag{" +
                "name='" + name + '\'' +
                ", versions=" + versions +
                '}';
    }
}
