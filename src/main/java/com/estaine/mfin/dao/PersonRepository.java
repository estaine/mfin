package com.estaine.mfin.dao;

import com.estaine.mfin.model.Person;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonRepository extends Repository<Person, Integer> {
    List<Person> findAll();
}
