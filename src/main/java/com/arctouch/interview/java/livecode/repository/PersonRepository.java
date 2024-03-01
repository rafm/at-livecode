 package com.arctouch.interview.java.livecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arctouch.interview.java.livecode.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
