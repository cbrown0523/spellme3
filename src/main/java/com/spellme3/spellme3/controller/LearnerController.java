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
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@CrossOrigin
@RestController
@RequestMapping("api/learner")
public class LearnerController {

    @Autowired
    LearnerRepository learnerRepository;

    @PostMapping("/")
    public ResponseEntity<?> createName(@RequestBody Learner newLearner) {
        Learner learner = learnerRepository.save(newLearner);
        return new ResponseEntity<>(learner, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public List<Learner> getAllLearners() {
        return learnerRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Learner>> getAllLearners(@PathVariable Long id) {
        return new ResponseEntity(learnerRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id) {
        Learner deleteLearner = learnerRepository.findById(id).get();
        learnerRepository.delete(deleteLearner);
        return "deleted learner with id: " + id;
    }

    @DeleteMapping("/delete/name/{name}")
    public String deleteByName(@PathVariable String name) {
     // Learner deleteALearner = learnerRepository.findByName(name);
        learnerRepository.deleteByName(name);
       // learnerRepository.delete(deleteALearner);
        return "deleted learner with name: " + name;
    }

    @DeleteMapping("/delete/all")
    public ResponseEntity<String> deleteAll() {
        learnerRepository.deleteAll();
        return new ResponseEntity<>("Deleted All", HttpStatus.OK);
    }
}



