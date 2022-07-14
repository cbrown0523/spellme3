package com.spellme3.spellme3.model;

public class SuggestedSearchesImage {
        private class Image{
                private String thumbnail;

                public Image() {
                }

                public Image(String thumbnail) {
                        this.thumbnail = thumbnail;
                }

                public String getThumbnail() {
                        return thumbnail;
                }

                public void setThumbnail(String thumbnail) {
                        this.thumbnail = thumbnail;
                }
        }
        private Image suggested_searches;

        public SuggestedSearchesImage() {
        }

        public SuggestedSearchesImage(Image suggested_searches) {
                this.suggested_searches = suggested_searches;
        }

        public Image getSuggested_searches() {
                return suggested_searches;
        }

        public void setSuggested_searches(Image suggested_searches) {
                this.suggested_searches = suggested_searches;
        }
}
