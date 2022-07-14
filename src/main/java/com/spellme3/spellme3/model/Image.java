package com.spellme3.spellme3.model;

import java.util.List;

public class Image {

    private List<Thumbnail> suggested_searches;

    public Image() {
    }

    public Image(List<Thumbnail> suggested_searches) {
        this.suggested_searches = suggested_searches;
    }

    public List<Thumbnail> getSuggested_searches() {
        return suggested_searches;
    }

    public void setSuggested_searches(List<Thumbnail> suggested_searches) {
        this.suggested_searches = suggested_searches;
    }
}
