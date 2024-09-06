package com.airportmanagementsystem.vechicle_service.service;

import com.airportmanagementsystem.vechicle_service.dto.VechicleDTO;
import com.airportmanagementsystem.vechicle_service.entity.Vechicle;
import com.airportmanagementsystem.vechicle_service.repository.VechicleRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional // Manages transactions
public class VechicleServiceImpl implements VechicleService {

    @Autowired
    private VechicleRepository vechicleRepository; // Repository dependency

    @Autowired
    private ModelMapper modelMapper; // ModelMapper dependency

    // Save a new vehicle
    @Override
    public VechicleDTO saveVechicle(VechicleDTO vechicleDTO) {
        vechicleRepository.save(modelMapper.map(vechicleDTO, Vechicle.class));
        return vechicleDTO;
    }

    // Update an existing vehicle
    @Override
    public VechicleDTO updateVechicle(VechicleDTO vechicleDTO) {
        vechicleRepository.save(modelMapper.map(vechicleDTO, Vechicle.class));
        return vechicleDTO;
    }

    // Delete a vehicle
    @Override
    public boolean deleteVechicle(int vehicleID) {
        if (vechicleRepository.existsById(vehicleID)) {
            vechicleRepository.deleteById(vehicleID);
            return true;
        }
        return false;
    }

    // Retrieve all vehicles
    @Override
    public List<VechicleDTO> getAllVechicles() {
        List<Vechicle> vehicles = vechicleRepository.findAll(); // Fetch all vehicles from the repository
        // Convert entities to DTOs using ModelMapper and return
        return vehicles.stream()
                .map(vehicle -> modelMapper.map(vehicle, VechicleDTO.class))
                .collect(Collectors.toList());
    }
}