package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class CicdApplication {
       @GetMapping
	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

	@GetMapping("/welcome")

	public String welcome(){

		return "Welcome to javatechie !";





	}
}
