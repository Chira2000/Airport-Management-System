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

@Service
@Transactional
public class PilotService { // conver to the interface
    @Autowired
    private PilotRepository pilotRepository;
    @Autowired
    private ModelMapper modelMapper;

    public PilotDTO savePilot(PilotDTO pilotDTO){
        pilotRepository.save(modelMapper.map(pilotDTO, Pilot.class));
        return pilotDTO;
    }
    public List<PilotDTO> getAllPilots(){
        List<Pilot> pilotList = pilotRepository.findAll();
        return modelMapper.map(pilotList, new TypeToken<List<PilotDTO>>(){}.getType());
    }
    public PilotDTO updatePilot(PilotDTO pilotDTO){
        pilotRepository.save(modelMapper.map(pilotDTO, Pilot.class));
        return pilotDTO;
    }
    public boolean deletePilot(int pilotId){
        if(pilotRepository.existsById(pilotId)){
            pilotRepository.deleteById(pilotId);
            return true;
        }
        return false;
    }
    //user id > user details
    // select * from user where id = 2
    public PilotDTO getPilotById(String pilotID){
        Pilot pilot = pilotRepository.getPilotByPilotID(pilotID);
        return modelMapper.map(pilot, PilotDTO.class);
    }

}
