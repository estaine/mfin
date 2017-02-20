package com.estaine.mfin.transaction;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface SimpleTransactionRepository extends Repository<SimpleTransaction, Integer> {
    List<SimpleTransaction> findAll();
}
