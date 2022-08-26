package com.ironhack.demosecurityjwt.controller.interfaces;

import com.ironhack.demosecurityjwt.DTO.RoleToUserDTO;
import com.ironhack.demosecurityjwt.model.Role;

public interface RoleControllerInterface {
    void saveRole(Role role);
    void addRoleToUser(RoleToUserDTO roleToUserDTO);
}
