package com.tsola2002.springmasterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringmasterclassApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmasterclassApplication.class, args);
	}


}
