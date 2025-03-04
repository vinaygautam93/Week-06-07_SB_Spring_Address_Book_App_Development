package com.example.addressbook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        return new ResponseEntity<>("Welcome to Address Book App", HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addEntry(@RequestBody String entry) {
        return new ResponseEntity<>("Entry Added: " + entry, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateEntry(@PathVariable int id, @RequestBody String updatedEntry) {
        return new ResponseEntity<>("Updated Entry ID " + id + ": " + updatedEntry, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEntry(@PathVariable int id) {
        return new ResponseEntity<>("Deleted Entry ID: " + id, HttpStatus.OK);
    }
}
