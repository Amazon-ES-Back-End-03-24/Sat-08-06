package com.ironhack.demosecurityjwt;

import com.ironhack.demosecurityjwt.model.Role;
import com.ironhack.demosecurityjwt.model.User;
import com.ironhack.demosecurityjwt.service.impl.RoleService;
import com.ironhack.demosecurityjwt.service.impl.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class DemoSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSecurityJwtApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService, RoleService roleService) {
		return args -> {
			roleService.saveRole(new Role(null, "ROLE_USER"));
			roleService.saveRole(new Role(null, "ROLE_ADMIN"));

			userService.saveUser(new User(null, "John Doe", "john", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "James Smith", "james", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Jane Carry", "jane", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Chris Anderson", "chris", "1234", new ArrayList<>()));

			roleService.addRoleToUser("john", "ROLE_USER");
			roleService.addRoleToUser("james", "ROLE_ADMIN");
			roleService.addRoleToUser("jane", "ROLE_USER");
			roleService.addRoleToUser("chris", "ROLE_ADMIN");
			roleService.addRoleToUser("chris", "ROLE_USER");
		};
	}

}
