package com.spellme3.spellme3.model;

import java.util.List;

public class Tutor_SearchLR {

    private LocalResult local_results;
    private LocalMap local_map;

    public Tutor_SearchLR() {
    }

    public Tutor_SearchLR(LocalResult local_results, LocalMap local_map) {
        this.local_results = local_results;
        this.local_map = local_map;
    }

    public LocalResult getLocal_results() {
        return local_results;
    }

    public void setLocal_results(LocalResult local_results) {
        this.local_results = local_results;
    }

    public LocalMap getLocal_map() {
        return local_map;
    }

    public void setLocal_map(LocalMap local_map) {
        this.local_map = local_map;
    }
}