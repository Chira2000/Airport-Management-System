package com.airportmanagementsystem.pilot_service.service;

import com.airportmanagementsystem.pilot_service.dto.PilotDTO;
import com.airportmanagementsystem.pilot_service.entity.Pilot;
import com.airportmanagementsystem.pilot_service.repository.PilotRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Implementation of the {@link PilotService} interface for managing pilots.
 */
@Service
@Transactional
public class PilotServiceImpl implements PilotService {  // This class implements the interface

    @Autowired
    private PilotRepository pilotRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PilotDTO savePilot(PilotDTO pilotDTO) {
        pilotRepository.save(modelMapper.map(pilotDTO, Pilot.class));
        return pilotDTO;
    }

    @Override
    public List<PilotDTO> getAllPilots() {
        List<Pilot> pilotList = pilotRepository.findAll();
        return modelMapper.map(pilotList, new TypeToken<List<PilotDTO>>() {}.getType());
    }

    @Override
    public PilotDTO updatePilot(PilotDTO pilotDTO) {
        pilotRepository.save(modelMapper.map(pilotDTO, Pilot.class));
        return pilotDTO;
    }

    @Override
    public boolean deletePilot(int pilotId) {
        if (pilotRepository.existsById(pilotId)) {
            pilotRepository.deleteById(pilotId);
            return true;
        }
        return false;
    }

    @Override
    public PilotDTO getPilotById(String pilotID) {
        Pilot pilot = pilotRepository.getPilotByPilotID(pilotID);
        return modelMapper.map(pilot, PilotDTO.class);
    }
}
