package com.airportmanagementsystem.controller;

import com.airportmanagementsystem.dto.PlaneDTO;
import com.airportmanagementsystem.entity.Plane;
import com.airportmanagementsystem.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/plane")
@CrossOrigin

public class PlaneController {

    @Autowired
    private PlaneService planeService;

    @GetMapping("/getPlanes")
    public List<PlaneDTO> getPlane(){
        return planeService.getAllPlane();
    }

    @PostMapping("/savePlane")
    public PlaneDTO savePlane(@RequestBody PlaneDTO planeDTO){
       return planeService.savePlane(planeDTO);
    }

    @PutMapping("/updatePlane")
    public PlaneDTO updatePlane(@RequestBody PlaneDTO planeDTO){
        return planeService.updatePlane(planeDTO);
    }

    @DeleteMapping("/deletePlane")
    public boolean deletePlane(@RequestBody PlaneDTO planeDTO){
        return planeService.deletePlane(planeDTO);
    }


}
