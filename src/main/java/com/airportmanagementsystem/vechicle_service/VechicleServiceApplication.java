package com.airportmanagementsystem.vechicle_service;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication // Marks this as a Spring Boot application
@EnableDiscoveryClient // Enables service discovery for microservices

public class VechicleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VechicleServiceApplication.class, args); // Starts the application
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper(); // Provides a ModelMapper bean
	}
}