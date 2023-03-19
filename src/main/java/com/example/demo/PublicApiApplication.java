package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublicApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicApiApplication.class, args);
		
		System.out.println("publicAPI is running");
		
	}

}
