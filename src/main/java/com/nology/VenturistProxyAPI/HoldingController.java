package com.nology.VenturistProxyAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = {"https://accentureclientprojecttest.web.app/", "http://localhost:3000", "http://localhost:3001"})
@RestController
public class HoldingController {

    @Autowired
    HoldingRepository repository;

    @GetMapping("/holdings")
    public ResponseEntity<List<Holding>> getHoldings() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @GetMapping("/holding/{id}")
    public ResponseEntity<Holding> getHoldingById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findById(Integer.parseInt(id)));
    }

    @GetMapping("/user-holding/{userId}")
    public ResponseEntity<List<Holding>> getHoldingByUserId(@PathVariable String userId){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAllHoldingByUserID(userId));
    }

    @PutMapping("/holdings")
    @Transactional
    public ResponseEntity<String> updateUserHolding(@RequestBody Holding holding ) {
        String userID = holding.getUserID();
        double amount = holding.getAmount();
        String currencyCode = holding.getCurrencyCode();
        repository.updateUserHolding(amount, userID, currencyCode);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("done");
    }

}
