package com.spellme3.spellme3.model;

import javax.persistence.*;

@Entity
public class AccountHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;

//    @OneToMany(mappedBy = "admin" , fetch = FetchType.LAZY)
//   private Learner learner ;

    public AccountHolder() {
    }

    public AccountHolder(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
       // this.learner = learner;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
