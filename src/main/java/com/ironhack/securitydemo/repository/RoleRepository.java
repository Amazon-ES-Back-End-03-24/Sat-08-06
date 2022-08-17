package com.ironhack.securitydemo.repository;

import com.ironhack.securitydemo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
