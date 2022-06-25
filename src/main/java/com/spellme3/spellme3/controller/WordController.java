package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.Word;
import com.spellme3.spellme3.model.Word2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

@RestController
@RequestMapping("/api")
public class WordController {

    @Autowired
    private Environment env;
    private String BASE_URL = "https://dictionaryapi.com/api/v3/references/sd2/json/";

    //private final String uri = "https://dictionaryapi.com/api/v3/references/sd2/json/test?key=11546cd6-1029-46ea-ad34-3abacc7bba69";

    @GetMapping("/section/{word}")
    public List<Word> getWords(RestTemplate restTemplate,
                                @PathVariable("word")String word){
        String uri = "https://dictionaryapi.com/api/v3/references/sd2/json/" + word + "?key=11546cd6-1029-46ea-ad34-3abacc7bba69";
        String APIKEYD = env.getProperty("apikeyD");
        String url = BASE_URL + word + "?key=" + APIKEYD;
    Word[] words = restTemplate.getForObject(url , Word[].class);
    return Arrays.asList(words);
    };

//    public WordList(){
//        words = new ArrayList<>();
//    }

    @GetMapping("/word/{word}")
    public ResponseEntity<?> testGetWord(RestTemplate restTemplate,
                                         @PathVariable("word")String word
                                         )

    {
        try {
        String uri = "https://dictionaryapi.com/api/v3/references/sd2/json/" + word +"?fields=definitions&strictMatch=true"+ "?key=11546cd6-1029-46ea-ad34-3abacc7bba69";

           String APIKEYD = env.getProperty("apikeyD");
           String url = BASE_URL + word +"?key=" + APIKEYD;
            Object response = restTemplate.getForObject(url, Object.class);
            System.out.println(response);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/word1/{id}")
    public ResponseEntity<?> testGetWord1(RestTemplate restTemplate,
                                          @PathVariable("id")String word) {
        try {
           String APIKEYD = env.getProperty("apikeyD");
           String url = BASE_URL + word +"?key=" + APIKEYD;
            Object response = restTemplate.getForObject(url, Object.class);
            System.out.println(response);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }


}
