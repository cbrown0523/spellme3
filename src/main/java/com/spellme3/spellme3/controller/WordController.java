package com.spellme3.spellme3.controller;
//Todo why is response slow
import com.spellme3.spellme3.model.Word;
import com.spellme3.spellme3.repositories.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@CrossOrigin
@RestController
@RequestMapping("/api/word")
public class WordController {

    @Autowired
    private Environment env;
    private String BASE_URL_Word = "http://api.wordnik.com/v4/words.json/";

@GetMapping("/{word}")
public ResponseEntity<?> getWord (RestTemplate restTemplate,
                              @PathVariable String word) {
try {
    String uri = "https://api.wordnik.com/v4/word.json/" + word + "/definitions?limit=1&partOfSpeech=noun&includeRelated=false&sourceDictionaries=webster&useCanonical=false&includeTags=false";
  String APIKEYW = env.getProperty("api_key_wordnik");
    HttpHeaders headers = new HttpHeaders();
headers.set("api_key", "uinf0mz5u7p3s739hye43ygvzjwqmahtos2okgtofs0ydhd9a");
    HttpEntity request = new HttpEntity(headers);
    return restTemplate.exchange(uri, HttpMethod.GET, request, Word[].class) ;

    //response.set("api_key", "uinf0mz5u7p3s739hye43ygvzjwqmahtos2okgtofs0ydhd9a");
//        Htt request = new HttpEntity(headers);
    //ttpEntity requests = new HttpEntity(headers);
    //return new ResponseEntity<>(request, HttpStatus.OK);
//return new ResponseEntity<>(requests, HttpStatus.OK);
    //return restTemplate.exchange(uri, HttpMethod.GET, response, Word.class);
        //ResponseEntity<?> response = restTemplate.exchange(url, HttpMethod.GET, request,Image.class)
      // Word response = restTemplate.exchange(url, HttpMethod.GET, request, Word.class).getBody();
       //return ResponseEntity.ok(response);
        //return restTemplate.exchange(url, HttpMethod.GET, request, Image.class);
    } catch (Exception e) {
        //return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        return ResponseEntity.internalServerError().body(e.getMessage());
    }

}
//}

}






//    private String BASE_URL = "https://dictionaryapi.com/api/v3/references/sd2/json/";
//
//    //private final String uri = "https://dictionaryapi.com/api/v3/references/sd2/json/test?key=11546cd6-1029-46ea-ad34-3abacc7bba69";
//
//    @GetMapping("/section/{word}")
//    public List<Word> getWords(RestTemplate restTemplate,
//                                @PathVariable("word")String word){
//        String uri = "https://dictionaryapi.com/api/v3/references/sd2/json/" + word + "?key=11546cd6-1029-46ea-ad34-3abacc7bba69";
//        String APIKEYD = env.getProperty("apikeyD");
//        String url = BASE_URL + word + "?key=" + APIKEYD;
//    Word[] words = restTemplate.getForObject(url , Word[].class);
//    return Arrays.asList(words);
//    };
//
////    public WordList(){
////        words = new ArrayList<>();
////    }
//
//    @GetMapping("/word1/{word}")
//    public ResponseEntity<?> testGetWord(RestTemplate restTemplate,
//                                         @PathVariable("word")String word
//                                         )
//
//    {
//        try {
//        String uri = "https://dictionaryapi.com/api/v3/references/sd2/json/" + word +"?fields=definitions&strictMatch=true"+ "?key=11546cd6-1029-46ea-ad34-3abacc7bba69";
//
//           String APIKEYD = env.getProperty("apikeyD");
//           String url = BASE_URL + word +"?key=" + APIKEYD;
//            Object response = restTemplate.getForObject(url, Object.class);
//            System.out.println(response);
//            return ResponseEntity.ok(response);
//        } catch (Exception e) {
//            return ResponseEntity.internalServerError().body(e.getMessage());
//        }
//    }
//
//    @GetMapping("/word1/{id}")
//    public ResponseEntity<?> testGetWord1(RestTemplate restTemplate,
//                                          @PathVariable("id")String word) {
//        try {
//           String APIKEYD = env.getProperty("apikeyD");
//           String url = BASE_URL + word +"?key=" + APIKEYD;
//            Object response = restTemplate.getForObject(url, Object.class);
//            System.out.println(response);
//            return ResponseEntity.ok(response);
//        } catch (Exception e) {
//            return ResponseEntity.internalServerError().body(e.getMessage());
//        }
//    }
//
//    @GetMapping("/{def}")
//    public ResponseEntity<?> testLandex(RestTemplate restTemplate,
//                                        @RequestParam(value="text", required=true) String text ,
//                                        @PathVariable(value="def") String def)
//
//    {
//        //https://dictionary.yandex.net/api/v1/dicservice.json/lookup?key=dict.1.1.20220628T072602Z.aca428777f380b08.325558516315235d96697c2f6680e67bd2f48c02&lang=en-en&text=time
//        try {
//            String APIKEY = env.getProperty("apikeyYandex");
//            //String url = BASE_URL + word +"?key=" + APIKEYD;
//            String uri ="https://dictionary.yandex.net/api/v1/dicservice.json/lookup?key=" + APIKEY + "&lang=en-en&=text=" + text + def;
//            //String url = "https://dictionary.yandex.net/api/v1/dicservice.json/lookup?key=dict.1.1.20220628T072602Z.aca428777f380b08.325558516315235d96697c2f6680e67bd2f48c02&lang=en-en&text="
//            Object response = restTemplate.getForObject(uri, Object.class);
//            System.out.println(response);
//            return ResponseEntity.ok(response);
//        } catch (Exception e) {
//            return ResponseEntity.internalServerError().body(e.getMessage());
//        }
//    }
//
//}
