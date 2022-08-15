package com.spellme3.spellme3.model;

import java.util.List;

public class Image {
    private Long id;
    private List<Thumbnail> suggested_searches;

    public Image() {
    }

    public Image(Long id, List<Thumbnail> suggested_searches) {
        this.id = id;
        this.suggested_searches = suggested_searches;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Thumbnail> getSuggested_searches() {
        return suggested_searches;
    }

    public void setSuggested_searches(List<Thumbnail> suggested_searches) {
        this.suggested_searches = suggested_searches;
    }
}
