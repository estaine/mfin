package com.estaine.mfin.person;

import com.estaine.mfin.person.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();
    void save(Person person);
}
