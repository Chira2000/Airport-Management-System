package com.airportmanagementsystem.pilot_service.controller;

import com.airportmanagementsystem.pilot_service.dto.PilotDTO;
import com.airportmanagementsystem.pilot_service.dto.apiResponse;
import com.airportmanagementsystem.pilot_service.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
//micro services - admin,pilot,hanger,plane,poter,vehicle

@RestController
@CrossOrigin // resourses sharings
@RequestMapping(value = "api/v1/pilot")
public class PilotController {

    @Autowired //repository inject
    PilotService pilotService;

    @GetMapping("/getPilots") // data fetching by list
    public List<PilotDTO> getPilot() {
        return pilotService.getAllPilots();
    }

    @PostMapping("/savePilot")
    public PilotDTO savePilot(@RequestBody PilotDTO pilotDTO) {    //@RequestBody->font-end Json object data -> java object type
        return pilotService.savePilot(pilotDTO);
    }

    @PutMapping("/updatePilot")
    public PilotDTO updatePilot(@RequestBody PilotDTO pilotDTO) {
        return pilotService.updatePilot(pilotDTO);
    }

    @DeleteMapping("/deletePilot/{pilotId}")
    public apiResponse deletePilot(@PathVariable int pilotId) {
        boolean isDeleted = pilotService.deletePilot(pilotId);
        if (isDeleted) {
            return new apiResponse("Pilot deleted successfully",true);
        }else{
            return new apiResponse("Pilot not found", false);
        }
    }

    // pilot's details filter by using pilot_ID
    @GetMapping("/getPilotByPilotId/{pilotID}")
    public PilotDTO getPilotByPilotID(@PathVariable String pilotID) {
       return pilotService.getPilotById(pilotID);
    }

}
