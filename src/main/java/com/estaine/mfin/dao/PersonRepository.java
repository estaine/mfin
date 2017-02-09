package com.estaine.mfin.dao;

import com.estaine.mfin.model.Person;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Collection<Person> findByEmail(String email);
}
