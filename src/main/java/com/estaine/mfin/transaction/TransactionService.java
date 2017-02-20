package com.estaine.mfin.transaction;

import com.estaine.mfin.person.Person;
import java.util.List;

public interface TransactionService {
    List<Transaction> findAll();
    void save(Transaction transaction);
    List<Transaction> findByPerson(Person person);
}
