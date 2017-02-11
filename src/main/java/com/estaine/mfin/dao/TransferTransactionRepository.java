package com.estaine.mfin.dao;

import com.estaine.mfin.model.TransferTransaction;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TransferTransactionRepository extends Repository<TransferTransaction, Integer> {
    List<TransferTransaction> findAll();
}
