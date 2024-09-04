package com.airportmanagementsystem.pilot_service.controller;

import com.airportmanagementsystem.pilot_service.dto.PilotDTO;
import com.airportmanagementsystem.pilot_service.dto.apiResponse;
import com.airportmanagementsystem.pilot_service.exception.ResourceNotFoundException;
import com.airportmanagementsystem.pilot_service.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/pilot")
public class PilotController {

    @Autowired
    PilotService pilotService;

    @GetMapping("/getPilots")
    public List<PilotDTO> getPilot() {
        return pilotService.getAllPilots();
    }

    @PostMapping("/savePilot")
    public PilotDTO savePilot(@RequestBody PilotDTO pilotDTO) {
        return pilotService.savePilot(pilotDTO);
    }

    @PutMapping("/updatePilot")
    public PilotDTO updatePilot(@RequestBody PilotDTO pilotDTO) {
        return pilotService.updatePilot(pilotDTO);
    }

    @DeleteMapping("/deletePilot/{pilotId}")
    public apiResponse deletePilot(@PathVariable int pilotId) {
        boolean isDeleted = pilotService.deletePilot(pilotId);
        if (!isDeleted) {
            throw new ResourceNotFoundException("Pilot with ID " + pilotId + " not found.");
        }
        return new apiResponse("Pilot deleted successfully", true);
    }

    @GetMapping("/getPilotByPilotId/{pilotID}")
    public PilotDTO getPilotByPilotID(@PathVariable String pilotID) {
        PilotDTO pilot = pilotService.getPilotById(pilotID);
        if (pilot == null) {
            throw new ResourceNotFoundException("Pilot with ID " + pilotID + " not found.");
        }
        return pilot;
    }
}
