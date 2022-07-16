package com.spellme3.spellme3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Thumbnail {
    private long id;
    private String thumbnail;
    public String ijn;
    public String chips;

    public Thumbnail() {
    }

    public Thumbnail(long id, String thumbnail, String ijn, String chips) {
        this.id = id;
        this.thumbnail = thumbnail;
        this.ijn = ijn;
        this.chips = chips;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIjn() {
        return ijn;
    }

    public void setIjn(String ijn) {
        this.ijn = ijn;
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }
}