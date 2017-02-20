package com.estaine.mfin.transaction;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface TransferTransactionRepository extends Repository<TransferTransaction, Integer> {
    List<TransferTransaction> findAll();
}
