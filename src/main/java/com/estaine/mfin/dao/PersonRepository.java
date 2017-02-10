package com.estaine.mfin.dao;

import com.estaine.mfin.model.Person;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface PersonRepository extends Repository<Person, Integer> {
    List<Person> findAll();
}
