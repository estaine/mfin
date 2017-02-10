package com.estaine.mfin.dao;

import com.estaine.mfin.model.SimpleTransaction;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface SimpleTransactionRepository extends Repository<SimpleTransaction, Integer> {
    List<SimpleTransaction> findAll();
}
