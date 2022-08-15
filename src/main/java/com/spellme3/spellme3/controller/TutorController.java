package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.Image;
import com.spellme3.spellme3.model.Tutor;
import com.spellme3.spellme3.model.Tutor1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping("/tutor")
public class TutorController {
    @Autowired
    Environment env;
    private String BASE_URL = "https://serpapi.com/search.json?q=tutor&location=";

    @GetMapping("/")
    public ResponseEntity<?> retrieveTutor(RestTemplate restTemplate,
                                           @RequestParam(value = "q", required = true) String query ){
        try {
            String APIKEY = env.getProperty("api_key_serapi");
            String url = BASE_URL + query + "&hl=en&gl=us&google_domain=google.com&api_key=" + APIKEY;
           // https://serpapi.com/search.json?q=tutor&location=02905,+Rhode+Island,+United+States&hl=en&gl=us&google_domain=google.com&api_key=0b4c18c4e97d974cc911fd61639452ef2e319459358b7770a0c3a5b71c8a8120
            Tutor response = restTemplate.getForObject(url, Tutor.class);
            System.out.println(response);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            //return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }

}
