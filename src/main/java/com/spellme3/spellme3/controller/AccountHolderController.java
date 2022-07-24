package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.AccountHolder;
import com.spellme3.spellme3.repositories.AccountHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

@PostMapping("/")
public ResponseEntity<?> createUser(@RequestBody AccountHolder newUser){
   AccountHolder accountHolder = new AccountHolder();
    accountHolder.setName((newUser.getName()));
    accountHolder.setPassword((newUser.getPassword()));
    aHRepository.save(newUser);
    return new ResponseEntity<>(accountHolder, HttpStatus.CREATED);
}
    @GetMapping("/all")
    public List<AccountHolder> getAllUsers(){
        return aHRepository.findAll();

}
    @GetMapping("/{id}")
    public Optional<AccountHolder> getUserById(@PathVariable Long id){

    return aHRepository.findById(id);
    }
}