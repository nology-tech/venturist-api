package com.nology.VenturistProxyAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"https://accentureclientprojecttest.web.app/", "http://localhost:3000", "http://localhost:3001"})
public class TransactionsController {

    @Autowired
    TransactionsRepository repository;

    @GetMapping("/transactions")
    public ResponseEntity<List<Transaction>> getTransactions(){
        return ResponseEntity.status(HttpStatus.FOUND).body(repository.findAll());
    }

    @PostMapping("/transaction")
    public ResponseEntity<String> makeTransaction(@RequestBody Transaction transaction){
        repository.save(transaction);
        return ResponseEntity.status(HttpStatus.OK).body("transaction record added");
    }
}
