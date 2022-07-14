package com.spellme3.spellme3.model;

import java.util.List;

public class Img {
    private class Suggested_Searches{
        private String thumbnail;

        public Suggested_Searches() {
        }

        public Suggested_Searches(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }
    }
    private List<Suggested_Searches> suggested_searches;

    public Img() {
    }

    public Img(List<Suggested_Searches> suggested_searches) {
        this.suggested_searches = suggested_searches;
    }

    public List<Suggested_Searches> getSuggested_searches() {
        return suggested_searches;
    }

    public void setSuggested_searches(List<Suggested_Searches> suggested_searches) {
        this.suggested_searches = suggested_searches;
    }
}
