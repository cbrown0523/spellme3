package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.Learner;
import com.spellme3.spellme3.model.SpellMe;
import com.spellme3.spellme3.model.Term;
import com.spellme3.spellme3.repositories.SpellMeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//private Long id;
//private String sampleWord;
//private String word;
//private Integer wordsAttempted;
//private Integer wordsCorrect;
//private Integer wordsAverage;
@CrossOrigin
@RestController
@RequestMapping("api/spell")

public class SpellMeController {
    @Autowired
    Environment env;
    @Autowired
    SpellMeRepository spellMeRepository;

    @PostMapping("/")
    public ResponseEntity<?> createProgress(@RequestBody SpellMe newSpell){
        SpellMe spell = new SpellMe();
        spell.setWord((newSpell.getWord()));
        spell.setSampleWord((newSpell.getSampleWord()));
        spellMeRepository.save(newSpell);
        return new ResponseEntity<>(spell, HttpStatus.CREATED);
    }
    @PostMapping("/{id}")
    public ResponseEntity<?> createProgressId(@RequestBody SpellMe newSpell, @PathVariable Long id){
        SpellMe spell = new SpellMe();
        spell.setWord((newSpell.getWord()));
        spell.setSampleWord((newSpell.getSampleWord()));
        spellMeRepository.save(newSpell);
        return new ResponseEntity<>(spell, HttpStatus.CREATED);
    }
    @GetMapping("/")
    public ResponseEntity<List<SpellMe>> getAllSpellings(){
        List<SpellMe> attemptedSpell = spellMeRepository.findAll();
        return  new ResponseEntity(attemptedSpell, HttpStatus.CREATED.OK);
    }
}
