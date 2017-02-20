package com.estaine.mfin.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public Person findByEmail(String email) {
        return personRepository.findByEmail(email);
    }
}
