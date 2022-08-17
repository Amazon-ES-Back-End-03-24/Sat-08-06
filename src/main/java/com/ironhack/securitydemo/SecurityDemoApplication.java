package com.ironhack.securitydemo;

import com.ironhack.securitydemo.model.Role;
import com.ironhack.securitydemo.model.User;
import com.ironhack.securitydemo.repository.RoleRepository;
import com.ironhack.securitydemo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserRepository userRepository, RoleRepository roleRepository) {
		return args -> {

			User user = new User("user","$2a$10$MSzkrmfd5ZTipY0XkuCbAejBC9g74MAg2wrkeu8/m1wQGXDihaX3e");
			User technician = new User("technician","$2a$10$MSzkrmfd5ZTipY0XkuCbAejBC9g74MAg2wrkeu8/m1wQGXDihaX3e");
			User admin = new User("admin","$2a$10$MSzkrmfd5ZTipY0XkuCbAejBC9g74MAg2wrkeu8/m1wQGXDihaX3e");

			userRepository.save(user);
			userRepository.save(technician);
			userRepository.save(admin);

			Role role1 = new Role("TECHNICIAN", technician);
			Role role2 = new Role("ADMIN", admin);
			Role role3 = new Role("TECHNICIAN", admin);

			roleRepository.save(role1);
			roleRepository.save(role2);
			roleRepository.save(role3);

		};
	}

}
