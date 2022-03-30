package com.nology.VenturistProxyAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.NoSuchElementException;

@CrossOrigin(origins = {"https://accentureclientprojecttest.web.app/", "http://localhost:3000"})
@RestController
public class FXController {

    @GetMapping("/hello")
    private String hello(){
        return "Hello!";
    }

    @GetMapping("/currencies")
    private ResponseEntity<Object> getCurrencies() {
        try {
            String url = "http://api.exchangeratesapi.io/v1/latest?access_key=a5d70fa4b404edb100ef0ebff23d52bc&format=1&base=GBP";
            RestTemplate restTemplate = new RestTemplate();
            Object currencies = restTemplate.getForObject(url, Object.class);
            return ResponseEntity.status(HttpStatus.OK).body(currencies);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/currencies/{currency}")
    public ResponseEntity<Object> getByBaseCurrency(@PathVariable String currency) {
        try {
            String url = "http://api.exchangeratesapi.io/v1/latest?access_key=a5d70fa4b404edb100ef0ebff23d52bc&format=1&base="+ currency;
            RestTemplate restTemplate = new RestTemplate();
            Object currencies = restTemplate.getForObject(url, Object.class);
            return ResponseEntity.status(HttpStatus.OK).body(currencies);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}

