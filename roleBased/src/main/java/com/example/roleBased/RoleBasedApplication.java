package com.example.roleBased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)

public class RoleBasedApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleBasedApplication.class, args);
	}



}
