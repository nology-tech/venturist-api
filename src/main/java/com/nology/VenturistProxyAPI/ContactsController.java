package com.nology.VenturistProxyAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = {"https://accentureclientprojecttest.web.app/", "http://localhost:3000", "http://localhost:3001"})
@RestController
public class ContactsController {

    @Autowired
    ContactsRepository repository;

    @GetMapping("/contacts")
    public ResponseEntity<List<Contacts>> getContacts() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @GetMapping("/contacts/{id}")
    public ResponseEntity <List<Contacts>>
    getContactsById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAllContactsByUserID(id));
    }

    @PostMapping("/contact")
    public ResponseEntity<String> createContact(@RequestBody Contacts contact) {
        repository.save(contact);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success, a new contact has been added");
    }

    @DeleteMapping("/contact/{id}")
    @Transactional
    public ResponseEntity<String> deleteContact(@PathVariable String id) {
        repository.deleteById(Integer.parseInt(id));
        return ResponseEntity.status(HttpStatus.OK).body("Deleted contact.");
    }
}
