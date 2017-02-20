package com.estaine.mfin.account;

import com.estaine.mfin.person.Person;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AccountRepository extends Repository<Account, Integer> {
    List<Account> findAll();
    void save(Account account);
    List<Account> findByPerson(Person person);
}
