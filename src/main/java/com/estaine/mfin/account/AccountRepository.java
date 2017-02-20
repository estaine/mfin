package com.estaine.mfin.account;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface AccountRepository extends Repository<Account, Integer> {
    List<Account> findAll();
}
