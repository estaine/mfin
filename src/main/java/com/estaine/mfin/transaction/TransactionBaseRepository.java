package com.estaine.mfin.transaction;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface TransactionBaseRepository<T extends Transaction> extends Repository<T, Integer> {
    T save(T transaction);
}
