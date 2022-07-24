package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.Term;
import com.spellme3.spellme3.repositories.WordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class TermController {
    @Autowired
    WordRepo wordRepo;

    @PostMapping("/addWord")
public Term addTerm(@RequestBody Term word){
    return wordRepo.save(word);
}

//    @PostMapping("/addAllWords")
//    public List<Term> addTerms(@RequestBody Term word){
//        List<Term> words = new ArrayList(Arrays.asList("user1", "user2"));
//        return new ResponseEntity( wordRepo.save(words));
//    }};

// wordRepo.save(Arrays.asList(
//    Term one = new Term(1, "hat");
//    Term two = new Term(2, "cat");
//    Term three = new Term(3, "nap");
//    words.add(one);
//    words.add(two);
//    words.add(three);
//        for (Term term : words) {
//            Term wordList = wordRepo.save(term);
//            return new ResponseEntity(wordList, HttpStatus.CREATED.OK);
//}
//        @GetMapping("/a")
//    public List<Term> getTerm(){
//        return words;
//    }

    @GetMapping("/")
    public ResponseEntity<List<Term>> getAllWords(){
        List<Term> wordList = wordRepo.findAll();
        return  new ResponseEntity(wordList, HttpStatus.CREATED.OK);
    }
    @GetMapping("/grade/firstgrade")
    public ResponseEntity<List<Term>> getAllFgWords(){

        List<Term> wordList = wordRepo.findAllByGrade("firstgrade");

        return  new ResponseEntity(wordList, HttpStatus.CREATED.OK);
    }
    @GetMapping("/grade/pk")
    public ResponseEntity<List<Term>> getAllPkWords(){

        List<Term> wordList = wordRepo.findAllByGrade("prek");

        return  new ResponseEntity(wordList, HttpStatus.CREATED.OK);
    }
    @GetMapping("/grade/k")
    public ResponseEntity<List<Term>> getAllKWords(){

        List<Term> wordList = wordRepo.findAllByGrade("kindergarten");

        return  new ResponseEntity(wordList, HttpStatus.CREATED.OK);
    }
//    @GetMapping("/firstgrade")
//    public ResponseEntity<?>getAllFg(@RequestBody List<Term> word){
//        Object response = wordRepo.fin
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Term> getWords(@PathVariable Long id){
        Optional<Term> wordList = wordRepo.findById(id);
        return  new ResponseEntity(wordList, HttpStatus.CREATED.OK);
    }
    @PostMapping("/")
    public ResponseEntity<String> SaveWord(@RequestBody Term term){
        Term word = wordRepo.save(term);
        return new ResponseEntity("saved...", HttpStatus.OK );
    }
    @PutMapping("/update/{id}")
    public String updateWord(@PathVariable long id, @RequestBody Term term){
        Term updateWord = wordRepo.findById(id).get();
        updateWord.setId(term.getId());
        updateWord.setTerm(term.getTerm());
        wordRepo.save(updateWord);
        return "updated...";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteWord(@PathVariable("id")long id){
        Term deleteWord = wordRepo.findById(id).get();
        wordRepo.delete(deleteWord);
        return "deleted word with id: " + id;
    }
};


