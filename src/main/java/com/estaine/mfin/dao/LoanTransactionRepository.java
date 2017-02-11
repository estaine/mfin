package com.estaine.mfin.dao;

import com.estaine.mfin.model.LoanTransaction;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface LoanTransactionRepository extends Repository<LoanTransaction, Integer> {
    List<LoanTransaction> findAll();
}
