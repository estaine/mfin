package com.estaine.mfin.service;

import com.estaine.mfin.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
    User findByUsername(String username);
}