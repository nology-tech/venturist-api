package com.nology.VenturistProxyAPI;

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

    @PostMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        repository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success, a new user has been added");
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

//    @DeleteMapping("/course/{id}")
//    @Transactional
//    public ResponseEntity<String> deleteCourse(@PathVariable String id) {
//        repository.deleteById(Integer.parseInt(id));
//        return ResponseEntity.status(HttpStatus.OK).body("Course Deleted");
//    }
}

