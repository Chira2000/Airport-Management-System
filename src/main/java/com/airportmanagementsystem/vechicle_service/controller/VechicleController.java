package com.airportmanagementsystem.vechicle_service.controller;

import com.airportmanagementsystem.vechicle_service.dto.VechicleDTO;
import com.airportmanagementsystem.vechicle_service.service.VechicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // REST controller
@RequestMapping(value = "api/v1/vechicle") // Base URL for all endpoints
@CrossOrigin // Allow cross-origin requests
public class VechicleController {

    @Autowired // Inject vechicleService
    private VechicleService vechicleService;

    @GetMapping("/showvechicle")
    public List<VechicleDTO> getVechicle() {
        // Call the method on the injected instance
        return vechicleService.getAllVechicles();
    }

    // Save a new vehicle
    @PostMapping("/savevechicle")
    public VechicleDTO saveVechicle(@RequestBody VechicleDTO vechicleDTO) {
        return vechicleService.saveVechicle(vechicleDTO);
    }

    // Update an existing vehicle
    @PutMapping("/updatevechicle")
    public VechicleDTO updateVechicle(@RequestBody VechicleDTO vechicleDTO) {
        return vechicleService.updateVechicle(vechicleDTO);
    }

    // Delete an existing vehicle
    @DeleteMapping("/deletevechicle/{vehicleID}")
    public boolean deleteVechicle(@PathVariable int vehicleID) {
        return vechicleService.deleteVechicle(vehicleID);
    }
}