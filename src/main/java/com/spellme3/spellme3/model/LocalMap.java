package com.spellme3.spellme3.model;

public class LocalMap {
    private String link;
    private String image;

    public LocalMap() {
    }

    public LocalMap(String link, String image) {
        this.link = link;
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
