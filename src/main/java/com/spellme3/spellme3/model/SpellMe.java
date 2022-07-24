package com.spellme3.spellme3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SpellMe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sampleWord;
    private String word;
    private Integer wordsAttempted;
    private Integer wordsCorrect;
    private Integer wordsAverage;

    public SpellMe() {
    }

    public SpellMe(Long id, String sampleWord, String word, Integer wordsAttempted, Integer wordsCorrect, Integer wordsAverage) {
        this.id = id;
        this.sampleWord = sampleWord;
        this.word = word;
        this.wordsAttempted = wordsAttempted;
        this.wordsCorrect = wordsCorrect;
        this.wordsAverage = wordsAverage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSampleWord() {
        return sampleWord;
    }

    public void setSampleWord(String sampleWord) {
        this.sampleWord = sampleWord;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
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
