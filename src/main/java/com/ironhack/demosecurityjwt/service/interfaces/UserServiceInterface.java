package com.ironhack.demosecurityjwt.service.interfaces;

import com.ironhack.demosecurityjwt.model.User;

import java.util.List;

public interface UserServiceInterface {
    User saveUser(User user);
    List<User> getUsers();
}
