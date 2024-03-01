package com.arctouch.interview.java.livecode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arctouch.interview.java.livecode.entity.Person;
import com.arctouch.interview.java.livecode.service.PersonService;

@RestController
public class PersonRestController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public List<Person> getAllPersons() {
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Person> getPersonByCpf(@PathVariable String cpf) {
    }
    

    @PostMapping("/")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
    }

    @PutMapping("/{cpf}")
    public ResponseEntity<Person> updatePerson(@PathVariable String cpf, @RequestBody Person person) {
    }

    @RequestMapping(value = "/{cpf}", method=RequestMethod.DELETE)
    public ResponseEntity<Void> deletePerson(@PathVariable String cpf) {
    }
    
}
