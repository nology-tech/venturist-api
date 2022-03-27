package com.nology.VenturistProxyAPI;

import com.google.api.services.sqladmin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin(origins = {"https://accentureclientprojecttest.web.app/", "http://localhost:3000", "http://localhost:3001"})
@RestController

public class UserController {

    @Autowired
    UserRepository repository;
    private List<User> users = new ArrayList<User>();

    @GetMapping("/users")
    private ResponseEntity<List<User>> getAllUsers() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/createuser")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        repository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success, a new user has been added");
    }
}
