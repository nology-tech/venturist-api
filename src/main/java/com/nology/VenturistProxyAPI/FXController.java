package com.nology.VenturistProxyAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.NoSuchElementException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FXController {

    @GetMapping("/hello")
    private String hello(){
        return "Hello!";
    }

}

