package com.estaine.mfin.transaction;

import com.estaine.mfin.person.Person;
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
    public void save(Transaction transaction) {

    }

    @Override
    public List<Transaction> findAll(Person person) {
        List<Transaction> transactions = new ArrayList<>();

        transactions.addAll(simpleTransactionRepository.findByAccountPerson(person));
        transactions.addAll(transferTransactionRepository.findByPerson(person));
        transactions.addAll(loanTransactionRepository.findByAccountPerson(person));

        return transactions;
    }
}
