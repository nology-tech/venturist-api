package com.nology.VenturistProxyAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

}
