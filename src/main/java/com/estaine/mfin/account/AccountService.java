package com.estaine.mfin.account;

import com.estaine.mfin.person.Person;
import java.util.List;


public interface AccountService {
    List<Account> findAll();
    void save(Account account);
    List<Account> findByPerson(Person person);
}
