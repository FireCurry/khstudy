package com.khgroup.khstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class KhstudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(KhstudyApplication.class, args);
	}

}
