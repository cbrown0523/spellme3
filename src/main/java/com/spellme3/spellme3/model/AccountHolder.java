package com.spellme3.spellme3.model;

import javax.persistence.*;

@Entity
public class AccountHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

//    @OneToMany(mappedBy = "admin" , fetch = FetchType.LAZY)
//   private Learner learner ;

    public AccountHolder() {
    }

    public AccountHolder(Long id, String name, Learner learner) {
        this.id = id;
        this.name = name;
//        this.learner = learner;
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

//    public Learner getLearner() {
//        return learner;
//    }
//
//    public void setLearner(Learner learner) {
//        this.learner = learner;
//    }
}
