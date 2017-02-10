package com.estaine.mfin.service;

import com.estaine.mfin.model.SimpleTransaction;
import java.util.List;

public interface SimpleTransactionService {
    List<SimpleTransaction> findAll();
}
