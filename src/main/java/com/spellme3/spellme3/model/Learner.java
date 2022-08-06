package com.spellme3.spellme3.model;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;

@Entity
public class Learner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String grade;
    private Integer wordsAttempted;
    private Integer wordsCorrect;
    private Integer wordsAverage;
    //time stamp
//    @OneToOne
//    @JoinTable(
//            name = "learner_table",
//            joinColumns = @JoinColumn(name = "learner_id"),
//            inverseJoinColumns = @JoinColumn(name = "admin_id")
//    )
//    public AccountHolder admin = new AccountHolder();

    @OneToOne
    @JoinColumn(name = "wordList_id", referencedColumnName = "id")
    @JsonIncludeProperties("id")
    private WordList wordList;

//    @ManyToOne
//    @JoinColumn(name = "admin_id", referencedColumnName = "id")
//    private AccountHolder admin;


    public Learner() {
    }

    public Learner(Long id, String name, String grade, Integer wordsAttempted, Integer wordsCorrect, Integer wordsAverage, WordList wordList) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.wordsAttempted = wordsAttempted;
        this.wordsCorrect = wordsCorrect;
        this.wordsAverage = wordsAverage;
        this.wordList = wordList;
    }

    public WordList getWordList() {
        return wordList;
    }

    public void setWordList(WordList wordList) {
        this.wordList = wordList;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getWordsAttempted() {
        return wordsAttempted;
    }

    public void setWordsAttempted(Integer wordsAttempted) {
        this.wordsAttempted = wordsAttempted;
    }

    public Integer getWordsCorrect() {
        return wordsCorrect;
    }

    public void setWordsCorrect(Integer wordsCorrect) {
        this.wordsCorrect = wordsCorrect;
    }

    public Integer getWordsAverage() {
        return wordsAverage;
    }

    public void setWordsAverage(Integer wordsAverage) {
        this.wordsAverage = wordsAverage;
    }

}