package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.Learner;
import com.spellme3.spellme3.model.Term;
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
@CrossOrigin
@RestController
@RequestMapping("api/learner")
public class LearnerController {


    @Autowired
    LearnerRepository learnerRepository;
//    @PostMapping
//    public ResponseEntity<?>createLearner( @RequestParam(value="text", required=true) String text
//                                          @RequestParam Integer age)
@PostMapping("/name")
public ResponseEntity<?> createAName(@RequestBody Learner newName){
    Learner learner = new Learner();
    learner.setName((newName.getName()));

    learnerRepository.save(newName);
    return new ResponseEntity<>(learner, HttpStatus.CREATED);
}
@PostMapping("/")
public ResponseEntity<?> createName(@RequestBody Learner newName){
    Learner learner = new Learner();
    learner.setName((newName.getName()));
    learner.setGrade((newName.getGrade()));
    learnerRepository.save(newName);
    return new ResponseEntity<>(learner, HttpStatus.CREATED);
    }
    @GetMapping("/all")
        public List<Learner>getAllLearners(){
    return learnerRepository.findAll();
        }
//Todo how to get individual fields ie the age of learner phil
    //Todo Word controller not working anymore
    //Todo mappoing database with joins and many to many etc

        @GetMapping("/{id}")
    public ResponseEntity<List<Learner>>getAllLearners(@PathVariable Long id) {
        return new ResponseEntity(learnerRepository.findById(id), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id) {
        Learner deleteLearner = learnerRepository.findById(id).get();
        learnerRepository.delete(deleteLearner);
        return "deleted learner with id: " + id;

    }

    }

