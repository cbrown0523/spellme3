package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.WordList;
import com.spellme3.spellme3.repositories.WordListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/wordlist")
public class WordListController {
    @Autowired
    Environment env;

    @Autowired
    WordListRepository wordListRepository;

    @PostMapping("/")
    public ResponseEntity<?>creatWordList(@RequestBody WordList newWordList){
        WordList wordList = wordListRepository.save(newWordList);
        return new ResponseEntity<>(wordList , HttpStatus.OK);
    }
    @PostMapping("/learner/{id}")
    public ResponseEntity<?>createWordListByLearnerId(@PathVariable Long id,@RequestBody WordList newWordList){
        WordList wordList = wordListRepository.save(newWordList);
        return new ResponseEntity<>(wordList , HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<WordList> getWordListByLearnerId(@PathVariable Long id){
        List<WordList> wordList = wordListRepository.findAllByLearner_Id(id);
        return  new ResponseEntity(wordList, HttpStatus.OK);
    }
    @GetMapping("/")
    public ResponseEntity<WordList> getWordList(){
        List<WordList> wordList = wordListRepository.findAll();
        return  new ResponseEntity(wordList, HttpStatus.OK);
    }


}
