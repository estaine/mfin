package com.estaine.mfin.person;

import com.estaine.mfin.person.Person;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonRepository extends Repository<Person, Integer> {
    List<Person> findAll();
    void save(Person person);
}
