package com.estaine.mfin.transaction;

import com.estaine.mfin.person.Person;
import java.util.List;

public interface TransactionService {
    void save(Transaction transaction);
    List<Transaction> findAll(Person person);
}
