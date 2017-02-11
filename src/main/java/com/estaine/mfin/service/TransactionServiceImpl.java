package com.estaine.mfin.service;

import com.estaine.mfin.dao.LoanTransactionRepository;
import com.estaine.mfin.dao.SimpleTransactionRepository;
import com.estaine.mfin.dao.TransferTransactionRepository;

import java.util.ArrayList;
import java.util.List;

import com.estaine.mfin.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    SimpleTransactionRepository simpleTransactionRepository;

    @Autowired
    TransferTransactionRepository transferTransactionRepository;

    @Autowired
    LoanTransactionRepository loanTransactionRepository;

    @Override
    public List<Transaction> findAll() {
        List<Transaction> transactions = new ArrayList<>();

        transactions.addAll(simpleTransactionRepository.findAll());
        transactions.addAll(transferTransactionRepository.findAll());
        transactions.addAll(loanTransactionRepository.findAll());

        return transactions;
    }
}
