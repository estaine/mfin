package com.estaine.mfin.dao;

import com.estaine.mfin.model.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User, Integer> {
    List<User> findAll();
    void save(User user);
}
