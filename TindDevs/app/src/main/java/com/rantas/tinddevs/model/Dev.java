package com.rantas.tinddevs.model;

import java.io.Serializable;

public class Dev implements Serializable {
    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;

    public Dev() {
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    @Override
    public String toString() {
        return "albumId= " + getAlbumId() +'\n'+
                "id= " + getId() + '\n'+
                "title= " + getTitle() + '\n' +
                "url= " + getUrl() + '\n' +
                "thumbnailUrl= " + getThumbnailUrl() +'\n';
    }
}

