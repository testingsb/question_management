package com.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QuestionManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(QuestionManagementApplication.class, args);
	}

}
