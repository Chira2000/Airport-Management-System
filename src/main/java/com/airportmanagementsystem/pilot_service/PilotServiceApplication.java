package com.airportmanagementsystem.pilot_service;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PilotServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PilotServiceApplication.class, args);
	}
	// Impor the Model Mapper
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
