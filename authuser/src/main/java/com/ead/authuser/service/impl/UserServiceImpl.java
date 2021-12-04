package com.ead.authuser.service.impl;

import com.ead.authuser.models.UserModel;
import com.ead.authuser.repositories.UserRepositroy;
import com.ead.authuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepositroy userRepositroy;

    @Override
    public List<UserModel> findAll() {
        return userRepositroy.findAll();
    }

    @Override
    public Optional<UserModel> findById(UUID userId) {
        return userRepositroy.findById(userId);
    }

    @Override
    public void delete(UserModel userModel) {
        userRepositroy.delete(userModel);
    }

    @Override
    public void save(UserModel userModel) {
        userRepositroy.save(userModel);
    }

    @Override
    public boolean existsByUsername(String username) {
        return userRepositroy.existsByUsername(username);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepositroy.existsByEmail(email);
    }
}
