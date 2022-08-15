package com.spellme3.spellme3.controller;


import com.spellme3.spellme3.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping("/image")
//Todo why all imagage ids zero

public class ImageController {
    @Autowired
    Environment env;
    private String BASE_URL_IMAGE = "https://serpapi.com/search.json?engine=google";

    @GetMapping("/")
    public ResponseEntity<?> retrieveImage(RestTemplate restTemplate,
                                           @RequestParam(value = "q", required = true) String query ){
        //@RequestParam(value = "tbm", defaultValue = "isch") String tbm
        try {
            String clipArt = "clip%20art%20";
            String APIKEY = env.getProperty("api_key_serapi");
            String url = BASE_URL_IMAGE + "&q=" + query + "&tbm=isch" + "&api_key=" + APIKEY;

            Image response = restTemplate.getForObject(url, Image.class);
            System.out.println(response);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            //return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            return ResponseEntity.internalServerError().body(e.getMessage());
        }

    }
    @GetMapping("/img")
    public ResponseEntity<?> retrieveImage2(RestTemplate restTemplate,
                                            @RequestParam(value = "q", required = true) String query ){
        //@RequestParam(value = "tbm", defaultValue = "isch") String tbm
        try {
            String clipArt = "clip%20art%20";
            String APIKEY = env.getProperty("api_key_serapi");
            String url = BASE_URL_IMAGE + "&q=" + clipArt + query + "&tbm=isch" + "&api_key=" + APIKEY;
            //String ur = "https://serpapi.com/search.json?engine=google" + &q=clip art apple&tbm=isch&api_key=a77b7364c5a8c2d239d919857f137f31c02b32f6652f34b54ee2f80f5ac5d28c";

            Object response = restTemplate.getForObject(url, Object.class);
            System.out.println(response);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            //return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
