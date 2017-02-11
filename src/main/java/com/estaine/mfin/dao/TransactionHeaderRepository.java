package com.estaine.mfin.dao;

import com.estaine.mfin.model.Transaction;
import org.springframework.data.repository.Repository;

public interface TransactionHeaderRepository extends Repository<Transaction, Integer> {
}
