package com.estaine.mfin.dao;

import com.estaine.mfin.model.Account;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AccountRepository extends Repository<Account, Integer> {
    List<Account> findAll();
}
