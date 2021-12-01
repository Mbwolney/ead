package com.ead.authuser.service.impl;

import com.ead.authuser.repositories.UserRepositroy;
import com.ead.authuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepositroy userRepositroy;
}
