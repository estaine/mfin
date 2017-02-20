package com.estaine.mfin.transaction;

import com.estaine.mfin.person.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TransferTransactionRepository extends TransactionBaseRepository<TransferTransaction> {
    List<TransferTransaction> findAll();

    @Query("SELECT t FROM TransferTransaction t WHERE t.fromAccount.person = ?1 OR t.toAccount.person = ?1")
    List<TransferTransaction> findByPerson(Person person);
}
