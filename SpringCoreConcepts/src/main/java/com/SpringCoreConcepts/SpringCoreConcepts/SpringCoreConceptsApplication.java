package com.SpringCoreConcepts.SpringCoreConcepts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// CommandLineRunner is interface
public class SpringCoreConceptsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreConceptsApplication.class, args);
	}

	UserService userService = new UserService();
	@Override
	public void run(String... args) throws Exception {
		userService.saveUser("Hello Hemant");

	}
}
