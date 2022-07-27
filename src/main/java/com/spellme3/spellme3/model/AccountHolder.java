package com.spellme3.spellme3.model;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;

@Entity
public class AccountHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "admin" , fetch = FetchType.LAZY)
    @JsonIncludeProperties("id")
    private Learner learner ;

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
    //    public Learner getLearner() {
//        return learner;
//    }
//
//    public void setLearner(Learner learner) {
//        this.learner = learner;
//    }
}
