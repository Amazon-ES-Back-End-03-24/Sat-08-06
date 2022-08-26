package com.ironhack.demosecurityjwt.service.interfaces;

import com.ironhack.demosecurityjwt.model.Role;

public interface RoleServiceInterface {
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
}
