package com.mickamy.qiitaviewer.dto;

public final class QiitaUser {

    public final String description;

    public final String facebookId;

    public final long foloweesCount;

    public final long followersCount;

    public final String githubLoginName;

    public final String id;

    public final long itemsCount;

    public final String linkedinId;

    public final String location;

    public final String name;

    public final String organization;

    public final long permanentId;

    public final String profileImageUrl;

    public final String twitterScreenName;

    public final String websiteUrl;

    public QiitaUser(String description, String facebookId, long foloweesCount, long followersCount, String githubLoginName, String id, long itemsCount, String linkedinId, String location, String name, String organization, long permanentId, String profileImageUrl, String twitterScreenName, String websiteUrl) {
        this.description = description;
        this.facebookId = facebookId;
        this.foloweesCount = foloweesCount;
        this.followersCount = followersCount;
        this.githubLoginName = githubLoginName;
        this.id = id;
        this.itemsCount = itemsCount;
        this.linkedinId = linkedinId;
        this.location = location;
        this.name = name;
        this.organization = organization;
        this.permanentId = permanentId;
        this.profileImageUrl = profileImageUrl;
        this.twitterScreenName = twitterScreenName;
        this.websiteUrl = websiteUrl;
    }

    @Override
    public String toString() {
        return "QiitaUser{" +
                "description='" + description + '\'' +
                ", facebookId='" + facebookId + '\'' +
                ", foloweesCount=" + foloweesCount +
                ", followersCount=" + followersCount +
                ", githubLoginName='" + githubLoginName + '\'' +
                ", id='" + id + '\'' +
                ", itemsCount=" + itemsCount +
                ", linkedinId='" + linkedinId + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", organization='" + organization + '\'' +
                ", permanentId=" + permanentId +
                ", profileImageUrl='" + profileImageUrl + '\'' +
                ", twitterScreenName='" + twitterScreenName + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                '}';
    }
}
