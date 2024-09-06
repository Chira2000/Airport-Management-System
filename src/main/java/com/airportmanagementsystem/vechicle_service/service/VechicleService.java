package com.airportmanagementsystem.vechicle_service.service;

import com.airportmanagementsystem.vechicle_service.dto.VechicleDTO;

import java.util.List;

public interface VechicleService {

    // Get all vehicles
    List<VechicleDTO> getAllVechicles();

    // Save a new vehicle
    VechicleDTO saveVechicle(VechicleDTO vechicleDTO);

    // Update an existing vehicle
    VechicleDTO updateVechicle(VechicleDTO vechicleDTO);

    // Delete a vehicle
    boolean deleteVechicle(int vehicleID);
}