package com.estaine.mfin.service;

import com.estaine.mfin.model.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> findAll();
}
