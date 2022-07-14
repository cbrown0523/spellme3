package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping("api/word")


public class WordController2 {
    @Autowired
    Environment env;
    @GetMapping("/{word}")

    //difference between requestBody and rest template
    //trying to retrieve a list of objects
    public ResponseEntity<?>getWord(@PathVariable String word, RestTemplate restTemplate) {
        try {
            String url = "https://api.wordnik.com/v4/word.json/" + word + "/definitions?limit=2&partOfSpeech=noun"+
                    "&includeRelated=false&sourceDictionaries=ahd-5&useCanonical=false&includeTags=false&" +
                    "api_key=" + env.getProperty("api_key_wordnik");
            Word response = restTemplate.getForObject(url, Word.class);
            //return ResponseEntity.ok(response);
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
