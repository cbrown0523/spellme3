////Todo I need retrieve the definition to be read by text to speech
package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.Word;
import com.spellme3.spellme3.repositories.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Transactional
@CrossOrigin
@RestController
@RequestMapping("api/define")

public class DefineController2 {

    @Autowired
    Environment env;

    @Autowired
    WordRepository wordRepository;

    @GetMapping("/{word}")

//difference between postForEntity and using repository.save
    //difference between requestBody and rest templatenj

    public ResponseEntity<Word[]> getWord(@PathVariable String word, RestTemplate restTemplate) {
        try {
            String url = "https://api.wordnik.com/v4/word.json/" + word + "/definitions?limit=2&partOfSpeech=noun"+
                    "&includeRelated=false&sourceDictionaries=webster&useCanonical=false&includeTags=false&" +
                    "api_key=" + env.getProperty("api_key_wordnik");
           Word[] response = restTemplate.getForObject(url, Word[].class);

            //return ResponseEntity.ok(response);
            return new ResponseEntity(response, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }}

    @GetMapping("/a/{word}")

//difference between postForEntity and using repository.save
    //difference between requestBody and rest templatenj
    //trying to retrieve a list of objects
    public ResponseEntity<?> getOneWord(@PathVariable String word, RestTemplate restTemplate) {
        try {
            String url = "https://api.wordnik.com/v4/word.json/" + word + "/definitions?limit=2&partOfSpeech=noun" +
                    "&includeRelated=false&sourceDictionaries=ahd-5&useCanonical=false&includeTags=false&" +
                    "api_key=" + env.getProperty("api_key_wordnik");

            List<Word> response = restTemplate.getForObject(url, List.class);
            List<Word> allWords = wordRepository.findAll();
            return ResponseEntity.ok(response);
            //return new ResponseEntity<>(response, HttpStatus.OK);

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
    //return wordRepository.findAll().toArray(new Word[1]);
    //the difference between getmapping response in api request and getmapping in database saved items
//    @GetMapping("/all")
//    public ResponseEntity<Word[]> retrieveAllWords(){
//        List<Word> word = wordRepository.findAll();
//        return new ResponseEntity(word, HttpStatus.OK);
//    }

    //with post mappping  a api request do i have use url to find then post
    @PostMapping("/{word}")
    public ResponseEntity<?> createAWord(@RequestBody Word newWord, @PathVariable String word,
                                         RestTemplate restTemplate) {
        String url = "https://api.wordnik.com/v4/word.json/" + word + "/definitions?limit=2&partOfSpeech=noun" +
                "&includeRelated=false&sourceDictionaries=ahd-5&useCanonical=false&includeTags=false&" +
                "api_key=" + env.getProperty("api_key_wordnik");


        return new ResponseEntity(wordRepository.save(newWord), HttpStatus.CREATED);

        //return new ResponseEntity<>(newWord , HttpStatus.OK);
    }

    @PostMapping("/all")
    public ResponseEntity<Word> createWord(@RequestBody Word allWord) {
        return new ResponseEntity(wordRepository.save(allWord), HttpStatus.CREATED);
        //return new ResponseEntity<>(allWord , HttpStatus.OK);
    }

//    @DeleteMapping("/{id}")
//    //the id of each word is a string, do i create my own Long id or use the one givn in api response
//    public ResponseEntity<Word> deleteOneById(@PathVariable Long id) {
////        wordRepository.deleteById(id);
//        return new ResponseEntity("Deleted", HttpStatus.OK);
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Word> deleteOne(@PathVariable Long id) {
       wordRepository.findById(id);
       wordRepository.deleteById(id);
        return new ResponseEntity("Deleted", HttpStatus.OK);
    }


    @PostMapping("/save")
    public String SaveWord(@RequestBody Word word) {
        wordRepository.save(word);
        return "saved...";
    }

    @GetMapping("/allOfWordWords")
    public List<Word> getWords() {
        return wordRepository.findAll();
    }
    @GetMapping("/c/{id}")
    public ResponseEntity<Word> getOne(@PathVariable Long id) {
        Optional<Word> oneWord = wordRepository.findById(id);
        return new ResponseEntity(oneWord , HttpStatus.OK);
    }
}