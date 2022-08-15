package com.spellme3.spellme3.model;

import java.util.ArrayList;
import java.util.List;

public class Tutor1 {

private Long id;
private String more_locations_link;
private ArrayList<Places> local_results;

        public Tutor1() {
        }

        public Tutor1(Long id, String more_locations_link, ArrayList<Places> local_results) {
                this.id = id;
                this.more_locations_link = more_locations_link;
                this.local_results = local_results;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public ArrayList<Places> getLocal_results() {
                return local_results;
        }

        public void setLocal_results(ArrayList<Places> local_results) {
                this.local_results = local_results;
        }
}

