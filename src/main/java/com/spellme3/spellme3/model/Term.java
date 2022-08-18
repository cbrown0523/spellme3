package com.spellme3.spellme3.model;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;

@Entity

public class Term {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String term;
    private String grade;
//    @ManyToMany
//    @JoinColumn(name = "list_id", referencedColumnName = "id")
//    @JsonIncludeProperties("id")
//   private WordList wordList = new WordList();
@ManyToOne
@JoinColumn(name = "learner_id", referencedColumnName = "id")
@JsonIncludeProperties("id")
private Learner learner;
//    @OneToOne
//    @JoinColumn(name = "term_id", referencedColumnName = "id")
//    @JsonIncludeProperties("id")
//    public WordList wordList = new WordList();


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

    public Term() {

    }

    public Term(long id, String term, String grade, Learner learner) {
        this.id = id;
        this.term = term;
        this.grade = grade;
        this.learner = learner;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"term\":\"" + term + '"' +
                '}';
    }
}