package com.ironhack.demosecurityjwt.controller.impl;

import com.ironhack.demosecurityjwt.controller.interfaces.UserControllerInterface;
import com.ironhack.demosecurityjwt.model.User;
import com.ironhack.demosecurityjwt.service.interfaces.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController implements UserControllerInterface {

    @Autowired
    private UserServiceInterface userService;

    //http://localhost:8080/api/users
    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }

}
