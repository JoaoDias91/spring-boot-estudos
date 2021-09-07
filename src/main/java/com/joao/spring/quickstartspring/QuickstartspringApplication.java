package com.joao.spring.quickstartspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class QuickstartspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickstartspringApplication.class, args);
	}


}
