package com.airportmanagementsystem.vechicle_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor // Constructor with all fields
@NoArgsConstructor  // No-argument constructor
@Data               // Getters, setters, toString, etc.
@Entity             // Marks this as a JPA entity

public class Vechicle {
    @Id
    private int vehicleId;       // Primary key
    private String vehicleType;  // Type of vehicle
    private String noPlate;      // Vehicle number plate
    private String vehicleModel; // Vehicle Model
    private String fuelType;     // Type of fuel
}