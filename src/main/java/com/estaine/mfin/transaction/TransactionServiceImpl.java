package com.estaine.mfin.transaction;

import java.util.ArrayList;
import java.util.List;

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
