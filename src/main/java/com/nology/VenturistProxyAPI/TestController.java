package com.nology.VenturistProxyAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@CrossOrigin(origins = {"https://accentureclientprojecttest.web.app/", "http://localhost:3000"})
@RestController
public class TestController {

    @Autowired
    TestRepository repo;

    @PutMapping("/holdings")
    @Transactional
    public ResponseEntity<String> updateUserHolding(@RequestBody Holding holding ) {
        String userID = holding.getUserID();
        double amount = holding.getAmount();
        String currencyCode = holding.getCurrencyCode();
    repo.updateUserHolding(amount, userID, currencyCode);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body("done");
    }

}
