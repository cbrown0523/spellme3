package com.spellme3.spellme3.model;

import java.util.ArrayList;
import java.util.List;

public class LocalResult {
    private String more_locations_link;
    private List<Places> places;

    public LocalResult() {
    }

    public LocalResult(String more_locations_link, List<Places> places) {
        this.more_locations_link = more_locations_link;
        this.places = places;
    }

    public String getMore_locations_link() {
        return more_locations_link;
    }

    public void setMore_locations_link(String more_locations_link) {
        this.more_locations_link = more_locations_link;
    }

    public List<Places> getPlaces() {
        return places;
    }

    public void setPlaces(List<Places> places) {
        this.places = places;
    }
}
