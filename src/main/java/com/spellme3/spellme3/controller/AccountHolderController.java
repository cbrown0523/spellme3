package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.AccountHolder;
import com.spellme3.spellme3.model.Learner;
import com.spellme3.spellme3.repositories.AccountHolderRepository;
import com.spellme3.spellme3.repositories.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/user")

public class AccountHolderController {

    @Autowired
    Environment env;

    @Autowired
    AccountHolderRepository aHRepository;

    @Autowired
    LearnerRepository learnerRepository;

    @PostMapping("/")
    public ResponseEntity<?> createName(@RequestBody AccountHolder newUser) {
        AccountHolder accountHolder = aHRepository.save(newUser);
        return new ResponseEntity<>(accountHolder, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public List<AccountHolder> getAllUsers() {
        return aHRepository.findAll();

    }

    @GetMapping("/{id}")
    public AccountHolder getUserById(@PathVariable Long id) {
        return aHRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public @ResponseBody AccountHolder updateAccountHolder(@PathVariable Long id, @RequestBody AccountHolder updates) {
        AccountHolder accountHolder = aHRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        if (updates.getName() != null) accountHolder.setName(updates.getName());
        if (updates.getEmail() != null) accountHolder.setEmail(updates.getEmail());
        if (updates.getLearner() != null) accountHolder.setLearner(updates.getLearner());


        return aHRepository.save(accountHolder);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAccountHolder(@PathVariable Long id) {
        aHRepository.deleteById(id);
        return new ResponseEntity<>("Deleted account id " + id, HttpStatus.OK);
    }

    @GetMapping("/learner/{learnerId}")
        public List<AccountHolder> getDevsByLanguage(@PathVariable Long learnerId) {
            return aHRepository.findAllByLearner_id(learnerId);
        }

    }
