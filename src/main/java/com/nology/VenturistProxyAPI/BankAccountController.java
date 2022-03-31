package com.nology.VenturistProxyAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = {"https://accentureclientprojecttest.web.app/", "http://localhost:3000", "http://localhost:3001"})
@RestController
public class BankAccountController {

    @Autowired
    BankAccountRepository repository;

    @GetMapping("/bank-account/{id}")
    public ResponseEntity<BankAccount> getBankAccountById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findById(Integer.parseInt(id)));
    }

    @GetMapping("user-bank-account/{userID}")
    public ResponseEntity<List<BankAccount>> getBankAccountByUserID(@PathVariable String userID) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAllByUserID(userID));
    }

    @PostMapping("/create-bank-account")
    public ResponseEntity<String> createBankAccount(@RequestBody BankAccount bankAccount) {
        repository.save(bankAccount);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success, a new Bank Account has been added");
    }

}
