package com.spellme3.spellme3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class AccountHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "learner_id", referencedColumnName = "id")
//    @JsonIncludeProperties("id")

//    public Set<Learner> learners = new HashSet<>();
//    or
    private Learner learner;

//    @OneToOne
//    private WordList wordList;


    public AccountHolder() {
    }

    public AccountHolder(Long id, String name, String email, Learner learner) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.learner = learner;
    }

    public Learner getLearner() {
        return learner;
    }

    public void setLearner(Learner learner) {
        this.learner = learner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}