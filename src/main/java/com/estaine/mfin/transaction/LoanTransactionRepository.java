package com.estaine.mfin.transaction;

import com.estaine.mfin.person.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface LoanTransactionRepository extends TransactionBaseRepository<LoanTransaction> {
    List<LoanTransaction> findAll();
    List<TransferTransaction> findByAccountPerson(Person person);
}
