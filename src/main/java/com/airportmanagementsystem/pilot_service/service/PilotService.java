package com.airportmanagementsystem.pilot_service.service;

import com.airportmanagementsystem.pilot_service.dto.PilotDTO;
import java.util.List;
/**
 * Service interface for managing pilots.
 * Provides methods for saving, updating, deleting, and retrieving pilots.
 * This interface will be implemented by {@link PilotServiceImpl}.
 */
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
