package com.spellme3.spellme3.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
@Entity
//create model tha parses array of object rest te,plat
//create multiple constructors for diff data
//create 1, 5 data sets
public class Word {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column
        private String term;

    @JsonProperty("section")
        private String section;

    public Word(String section) {
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getTerm() {
            return term;
        }

        public void setTerm(String term) {
            this.term = term;
        }

        public Word() {

        }

        @Override
        public String toString() {
            return "{" +
                    "\"id\":" + id +
                    ", \"term\":\"" + term + '"' +
                    '}';
        }
    }


