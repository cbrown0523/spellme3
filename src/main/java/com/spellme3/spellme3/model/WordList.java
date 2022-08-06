package com.spellme3.spellme3.model;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;

@Entity
public class WordList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
    private String grade;
//many to one is mappedBy = "learner" , fetch = FetchType.LAZY) not needed
    @ManyToOne
    @JoinColumn(name = "learner_id", referencedColumnName = "id")
    @JsonIncludeProperties("id")
    private Learner learner;

    public WordList() {
    }

    public WordList(Long id, String word, String grade, Learner learner) {
        this.id = id;
        this.word = word;
        this.grade = grade;
        this.learner = learner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Learner getLearner() {
        return learner;
    }

    public void setLearner(Learner learner) {
        this.learner = learner;
    }
}
