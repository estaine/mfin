package com.estaine.mfin.transaction;

import com.estaine.mfin.person.Person;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface SimpleTransactionRepository extends TransactionBaseRepository<SimpleTransaction> {
    List<SimpleTransaction> findAll();
    List<SimpleTransaction> findByAccountPerson(Person person);
}
