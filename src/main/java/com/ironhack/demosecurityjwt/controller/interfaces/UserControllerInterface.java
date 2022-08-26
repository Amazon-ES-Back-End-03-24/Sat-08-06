package com.ironhack.demosecurityjwt.controller.interfaces;

import com.ironhack.demosecurityjwt.model.User;

import java.util.List;

public interface UserControllerInterface {
    List<User> getUsers();
    void saveUser(User user);
}
