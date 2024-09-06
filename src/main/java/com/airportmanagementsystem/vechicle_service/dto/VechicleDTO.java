package com.airportmanagementsystem.vechicle_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor // Generates a constructor with all fields
@NoArgsConstructor  // Generates a no-argument constructor
@Data               // Generates getters, setters, toString, etc.

public class VechicleDTO {
    private int vehicleId;       // Vehicle ID
    private String vehicleType;  // Type of vehicle
    private String noPlate;      // Vehicle number plate
    private String vehicleModel; // Vehicle Model
    private String fuelType;     // Vehicle fuel type
}