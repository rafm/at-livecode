package com.arctouch.interview.java.livecode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arctouch.interview.java.livecode.entity.Person;
import com.arctouch.interview.java.livecode.repository.PersonRepository;


@Service
public class PersonService {
    
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
    }

    public Person getByCpf(String cpf) {
    }

    public Person createPerson(Person person) {
    }

    public Person updatePerson(Person person) {
    }

    public void deletePerson(String cpf) {
    }
}
