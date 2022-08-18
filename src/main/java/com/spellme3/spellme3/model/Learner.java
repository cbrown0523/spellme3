package com.spellme3.spellme3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany
    @JoinTable(
            name = "learner_spellMe",
            inverseJoinColumns = @JoinColumn(name = "spellMe_id")
    )
    //@JsonIgnoreProperties("developers")
    public Set<SpellMe> spellMes = new HashSet<>();

    public Learner() {
    }

    public Learner(Long id, String name, String grade, Integer wordsAttempted, Integer wordsCorrect,
                   Integer wordsAverage, Set<SpellMe> spellMes) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.wordsAttempted = wordsAttempted;
        this.wordsCorrect = wordsCorrect;
        this.wordsAverage = wordsAverage;
        this.spellMes = spellMes;
    }

    public Set<SpellMe> getSpellMes() {
        return spellMes;
    }

    public void setSpellMes(Set<SpellMe> spellMes) {
        this.spellMes = spellMes;
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