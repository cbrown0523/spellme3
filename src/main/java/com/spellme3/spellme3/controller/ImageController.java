package com.spellme3.spellme3.controller;

import com.spellme3.spellme3.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class ImageController {
    @Autowired
    Environment env;
    private String BASE_URL_IMAGE = "https://api.pexels.com/v1/search";

    @GetMapping("/")
    public ResponseEntity<?> getImage(RestTemplate restTemplate,
                                          @RequestParam(value = "query", required = true) String query1 ,
                                          @RequestParam(value = "per_page", defaultValue = "1") int page ){
        try {
            String APIKEYI = env.getProperty("apiKeyPexels");
           String url = "https://api.pexels.com/v1/search?query=" + query1 + "&per_page=" + page;
            //String ur = "https://api.pexels.com/v1/search?query=dog&per_page=1" ;
            HttpHeaders headers = new HttpHeaders();
            headers.setBearerAuth(APIKEYI);

            HttpEntity request = new HttpEntity(headers);
            //return new ResponseEntity<>(request, HttpStatus.OK);

            //difference between
            //return restTemplate.exchange(url, HttpMethod.GET, request, Image.class);
            //ResponseEntity<?> response = restTemplate.exchange(url, HttpMethod.GET, request,Image.class)
            Image response = restTemplate.exchange(url, HttpMethod.GET, request,Image.class).getBody();
           return ResponseEntity.ok(response);
            //return restTemplate.exchange(url, HttpMethod.GET, request, Image.class);
        } catch (Exception e) {
            //return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }
}
