package com.estaine.mfin.transaction;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface LoanTransactionRepository extends Repository<LoanTransaction, Integer> {
    List<LoanTransaction> findAll();
}
