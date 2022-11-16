package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.Tutor_SearchLR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping("/tutorSearch")
public class Tutor_SearchLRController {
    @Autowired
    Environment env;
    private String BASE_URL = "https://serpapi.com/search.json?q=academictutors&location=";

    @GetMapping("/")
    public ResponseEntity<?> getTutor(RestTemplate restTemplate,
                                           @RequestParam(value = "q", required = true) String query ){
        try {
            String APIKEY = env.getProperty("api_key_serapi");
            String ui = BASE_URL + query + "&hl=en&gl=us&google_domain=google.com&api_key=" + APIKEY;
        String uri =  "https://serpapi.com/search.json?q=academictutor&location="+ query + "&hl=en&gl=us&google_domain=google.com&api_key=64f72c0e57e2f8e18aeb5b6d3bc9ec80bf09d8ab6c981cd7ad92128ac1d5a07e";
            String url = "https://serpapi.com/search.json?engine=google&q=tutors&location=" + query + "&api_key=" + APIKEY;
            Object response = restTemplate.getForObject(uri, Object.class);
            System.out.println(response);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            //return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }

}

