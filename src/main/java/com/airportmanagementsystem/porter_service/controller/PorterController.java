package com.airportmanagementsystem.porter_service.controller;

import com.airportmanagementsystem.porter_service.dto.ApiResponse;
import com.airportmanagementsystem.porter_service.dto.PorterDTO;
import com.airportmanagementsystem.porter_service.exception.PorterNotFoundException;
import com.airportmanagementsystem.porter_service.service.PorterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1") //base URL
public class PorterController{
    @Autowired
    PorterService porterService;

    @GetMapping("/getporters")
    public List<PorterDTO> getPorters(){
        return porterService.getAllPorters();
    }

    @PostMapping("/addporter")
    public PorterDTO savePorter(@RequestBody PorterDTO porterDTO){
        return porterService.savePorter(porterDTO);
    }

    @PutMapping("/updateporter")
    public PorterDTO updatePorter(@RequestBody PorterDTO porterDTO){
        return porterService.updatePorter(porterDTO);
    }

    @DeleteMapping("/deleteporter/{porterId}")
    public ApiResponse deletePorter(@PathVariable int porterId){
        boolean isDeleted = porterService.deletePorter(porterId);
        if (!isDeleted){
            throw new PorterNotFoundException("Porter with ID " + porterId + "not found.");
        }
        ApiResponse response = new ApiResponse("Porter deleted successfully", true);
        return response;
    }

    @GetMapping("/getporterbyid/{porterId}")
    public PorterDTO getPorterByPorterId(@PathVariable int porterId){
    PorterDTO porter = porterService.getPorterById(porterId);
    if(porter == null) {
        throw new PorterNotFoundException("Porter with ID " + porterId + "not found.");
    }
    return porter;
}
}