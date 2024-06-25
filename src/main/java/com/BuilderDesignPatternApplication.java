package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderDesignPatternApplication.class, args);
		
	User user =	new User.UserBuilder()
		.setUserId("101")
		.setUserName("shammy")
		.setEmailId("abc@gmail.com")
		.build();
	System.out.println(user);
		
	}

}
