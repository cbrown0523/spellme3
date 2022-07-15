package com.spellme3.spellme3.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;

//create model tha parses array of object rest te,plat
//create multiple constructors for diff data
//create 1, 5 data sets
@Entity
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
    private String text;


    public Word() {
    }

    public Word(Long id, String word, String text) {
        this.id = id;
        this.word = word;
        this.text = text;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
//[
//        {
//        "id": "B5061200-1",
//        "partOfSpeech": "noun",
//        "attributionText": "from The American Heritage® Dictionary of the English Language, 5th Edition.",
//        "sourceDictionary": "ahd-5",
//        "sequence": "1",
//        "score": 0,
//        "word": "bank",
//        "attributionUrl": "https://ahdictionary.com/",
//        "wordnikUrl": "https://www.wordnik.com/words/bank",
//        "citations": [],
//        "exampleUses": [],
//        "labels": [],
//        "notes": [],
//        "relatedWords": [],
//        "textProns": []
//        },
//        {
//        "id": "B5061200-2",
//        "partOfSpeech": "noun",
//        "attributionText": "from The American Heritage® Dictionary of the English Language, 5th Edition.",
//        "sourceDictionary": "ahd-5",
//        "text": "A business establishment in which money is kept for saving or commercial purposes or is invested, supplied for loans, or exchanged.",
//        "sequence": "2",
//        "score": 0,
//        "word": "bank",
//        "attributionUrl": "https://ahdictionary.com/",
//        "wordnikUrl": "https://www.wordnik.com/words/bank",
//        "citations": [],
//        "exampleUses": [],
//        "labels": [],
//        "notes": [],
//        "relatedWords": [],
//        "textProns": []
//        }
       // ]