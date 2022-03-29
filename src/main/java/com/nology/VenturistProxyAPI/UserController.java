package com.nology.VenturistProxyAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = {"https://accentureclientprojecttest.web.app/", "http://localhost:3000", "http://localhost:3001"})
@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    private List<Users> users = new ArrayList<Users>();

    @PostMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody Users users) {
        repository.save(users);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success, a new user has been added");
    }

    @GetMapping("/users")
    public ResponseEntity<List<Users>> getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }



}

