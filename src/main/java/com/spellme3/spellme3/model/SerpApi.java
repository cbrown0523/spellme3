package com.spellme3.spellme3.model;

import java.util.List;

public class SerpApi {
//    private class search_metadata{
//        private String status;
//
//        public search_metadata() {
//        }
//
//        public search_metadata(String status) {
//            this.status = status;
//        }
//
//        public String getStatus() {
//            return status;
//        }
//
//        public void setStatus(String status) {
//            this.status = status;
//        }
//    }
//    private class search_parameters{
//        private String q;
//
//        public search_parameters() {
//        }
//
//        public search_parameters(String q) {
//            this.q = q;
//        }
//
//        public String getQ() {
//            return q;
//        }
//
//        public void setQ(String q) {
//            this.q = q;
//        }
//    }
    private List<SuggestedSearchesImage>searches;

    public SerpApi() {
    }

    public SerpApi(List<SuggestedSearchesImage> searches) {
        this.searches = searches;
    }

    public List<SuggestedSearchesImage> getSearches() {
        return searches;
    }

    public void setSearches(List<SuggestedSearchesImage> searches) {
        this.searches = searches;
    }
}
