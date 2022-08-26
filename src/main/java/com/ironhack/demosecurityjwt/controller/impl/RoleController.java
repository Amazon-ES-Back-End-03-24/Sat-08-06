package com.ironhack.demosecurityjwt.controller.impl;

import com.ironhack.demosecurityjwt.DTO.RoleToUserDTO;
import com.ironhack.demosecurityjwt.controller.interfaces.RoleControllerInterface;
import com.ironhack.demosecurityjwt.model.Role;
import com.ironhack.demosecurityjwt.service.interfaces.RoleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoleController implements RoleControllerInterface {

    @Autowired
    private RoleServiceInterface roleService;

    @PostMapping("/roles")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveRole(@RequestBody Role role) {
        roleService.saveRole(role);
    }

    @PostMapping("/roles/addtouser")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addRoleToUser(@RequestBody RoleToUserDTO roleToUserDTO) {
        roleService.addRoleToUser(roleToUserDTO.getUsername(),roleToUserDTO.getRoleName());
    }
}
