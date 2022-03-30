package com.nology.VenturistProxyAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"https://accentureclientprojecttest.web.app/", "http://localhost:3000", "http://localhost:3001"})
@RestController
public class AddressController {

    @Autowired
    AddressRepository repository;

    @PostMapping("/address")
    public ResponseEntity<String> createUser(@RequestBody Address address) {
        repository.save(address);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success, a new address has been added");
    }

    @GetMapping("/addresses")
    public ResponseEntity<List<Address>> getAddresses() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @GetMapping("/address/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findById(Integer.parseInt(id)));
    }

    @GetMapping("/user-address/{userId}")
    public ResponseEntity<List<Address>> getAddressByUserId(@PathVariable String userId){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAllAddressByUserID(userId));
    }

}
