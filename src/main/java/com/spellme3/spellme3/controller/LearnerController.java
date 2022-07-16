package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.Learner;
import com.spellme3.spellme3.repositories.LearnerRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.element.Name;
import java.util.List;

//private Long id;
//private String name;
//private String age;
//private String wordsAttempted;
//private String wordsCorrect;
//private String wordsAverage;
public class LearnerController {
    @Autowired
    LearnerRepository learnerRepository;
//    @PostMapping
//    public ResponseEntity<?>createLearner( @RequestParam(value="text", required=true) String text
//                                          @RequestParam Integer age)

@PostMapping("/learner")
public ResponseEntity<?> createName(@RequestBody Learner newName){
    Learner learner = new Learner();
    learner.setName((newName.getName()));
    learner.setAge((newName.getAge()));
    learnerRepository.save(newName);
    return new ResponseEntity<>(learner, HttpStatus.CREATED);
    }
    @GetMapping("/learner/all")
        public List<Learner>getAllLearners(){
            return learnerRepository.findAll();
        }
    @GetMapping("/learner/{id}")
    public ResponseEntity<List<Learner>>getAllLearners(@PathVariable Long id) {
        return new ResponseEntity(learnerRepository.findById(id), HttpStatus.OK);
    }
    }

