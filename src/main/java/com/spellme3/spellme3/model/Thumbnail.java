package com.spellme3.spellme3.model;

import java.util.List;

public class Thumbnail {
    private String thumbnail;
    public String ijn;
    public String chips;

    public Thumbnail() {
    }

    public Thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;

    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}