package com.ironhack.demosecurityjwt.service.impl;

import com.ironhack.demosecurityjwt.model.Role;
import com.ironhack.demosecurityjwt.model.User;
import com.ironhack.demosecurityjwt.repository.RoleRepository;
import com.ironhack.demosecurityjwt.repository.UserRepository;
import com.ironhack.demosecurityjwt.service.interfaces.RoleServiceInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RoleService implements RoleServiceInterface {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;


    public Role saveRole(Role role) {
        log.info("Saving a new role {} to the database", role.getName());
        return roleRepository.save(role);
    }

    public void addRoleToUser(String username, String roleName) {
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
        userRepository.save(user);
    }
}
