package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.Word;
import com.spellme3.spellme3.repositories.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/word")


public class WordController2 {
    @Autowired
    WordRepository wordRepository;

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

           Word[] response = restTemplate.getForObject(url, Word[].class);
            //return ResponseEntity.ok(response);
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

//animal jellyfish   some text fields are null in api response. If so i need to interate through until text field has a value
//    Word[] wordList = restTemplate.getForObject(url, Word[].class);
//            for (Word word1 : wordList) {
//                if (word1.getText().isEmpty()) {
//                return new ResponseEntity("Not found", HttpStatus.NOT_FOUND);
//         {
//      return new ResponseEntity(wordList, HttpStatus.OK);
//                }
//

    @PostMapping("/")
    public ResponseEntity<Word> createWord( @RequestBody Word newWord){
        System.out.println(newWord.getId());
       return new ResponseEntity<>(wordRepository.save(newWord), HttpStatus.CREATED);
       // return new ResponseEntity<>(newWord , HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    //the id of each word is a string, do i create my own Long id or use the one givn in api response
    public ResponseEntity<Word> deleteOneById(@PathVariable Long id) {
        wordRepository.deleteById(id);
        return new ResponseEntity("Deleted", HttpStatus.OK);
    }
    @DeleteMapping("/{word}")
    //the id of each word is a string, do i create my own Long id or use the one givn in api response
    public ResponseEntity<Word> deleteOne(@PathVariable String word) {
        wordRepository.delete(word);
        return new ResponseEntity("Deleted", HttpStatus.OK);
    }
}