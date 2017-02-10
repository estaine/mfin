package com.estaine.mfin.service;

import com.estaine.mfin.dao.SimpleTransactionRepository;
import com.estaine.mfin.model.SimpleTransaction;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SimpleTransactionServiceImpl implements SimpleTransactionService {
    @Autowired
    SimpleTransactionRepository simpleTransactionRepository;

    @Override
    public List<SimpleTransaction> findAll() {
        return simpleTransactionRepository.findAll();
    }
}
