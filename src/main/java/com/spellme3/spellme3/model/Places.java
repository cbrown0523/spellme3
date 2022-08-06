package com.spellme3.spellme3.model;

public class Places {
    private Long id;
    private String position;
    private String title;
    private String place_id;
    private String lsig;
    private String place_id_search;
    private String description;
    private String rating;
    private String type;
    private String hours;
    private String address;
    private String website;

    public Places() {
    }

    public Places( String position, String title, String place_id, String lsig, String place_id_search, String description, String rating, String type, String hours, String address, String website) {

        this.position = position;
        this.title = title;
        this.place_id = place_id;
        this.lsig = lsig;
        this.place_id_search = place_id_search;
        this.description = description;
        this.rating = rating;
        this.type = type;
        this.hours = hours;
        this.address = address;
        this.website = website;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getLsig() {
        return lsig;
    }

    public void setLsig(String lsig) {
        this.lsig = lsig;
    }

    public String getPlace_id_search() {
        return place_id_search;
    }

    public void setPlace_id_search(String place_id_search) {
        this.place_id_search = place_id_search;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
