package com.airportmanagementsystem.pilot_service.service;

import com.airportmanagementsystem.pilot_service.dto.PilotDTO;
import java.util.List;

public interface PilotService {
    // Method to save a pilot
    PilotDTO savePilot(PilotDTO pilotDTO);

    // Method to retrieve all pilots
    List<PilotDTO> getAllPilots();

    // Method to update a pilot
    PilotDTO updatePilot(PilotDTO pilotDTO);

    // Method to delete a pilot
    boolean deletePilot(int pilotId);

    // Method to get pilot by ID
    PilotDTO getPilotById(String pilotID);
}
