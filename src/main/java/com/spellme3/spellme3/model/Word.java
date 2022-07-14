package com.spellme3.spellme3.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;

//create model tha parses array of object rest te,plat
//create multiple constructors for diff data
//create 1, 5 data sets
public class Word {
    private String id;
    private String word;

    public Word() {
    }

    public Word(String id, String word) {
        this.id = id;
        this.word = word;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
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