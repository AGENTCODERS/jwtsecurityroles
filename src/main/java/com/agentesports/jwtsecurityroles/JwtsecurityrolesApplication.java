package com.agentesports.jwtsecurityroles;

import com.agentesports.jwtsecurityroles.entities.Role;
import com.agentesports.jwtsecurityroles.entities.User;
import com.agentesports.jwtsecurityroles.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class JwtsecurityrolesApplication implements CommandLineRunner {

	@Autowired
	public UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(JwtsecurityrolesApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		User adminAccount =userRepository.findByRole(Role.Admin);
		if(null==adminAccount)
		{
			User user=new User();
			user.setEmail("admin@test.com");
			user.setFirstName("admin");
			user.setLastName("admin");
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
			user.setRole(Role.Admin);
			userRepository.save(user);
		}

	}
}
