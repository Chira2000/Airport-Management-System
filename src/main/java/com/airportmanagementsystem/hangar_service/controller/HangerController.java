package com.airportmanagementsystem.hangar_service.controller;

import com.airportmanagementsystem.hangar_service.dto.HangerDTO;
import com.airportmanagementsystem.hangar_service.service.HangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/hanger") // base url
@CrossOrigin
public class HangerController {
    @Autowired
    HangerService hangerService; //for insert
    @PostMapping("/addhanger")
    public HangerDTO addHanger
            (@RequestBody HangerDTO hangerDTO)
    {
        return hangerService.addHanger(hangerDTO);
    }
    @GetMapping("/gethanger") // for data retrieve
    public List<HangerDTO> getHanger() {
        return hangerService.getAllHangers();
    }

    @PutMapping("/updatehanger") //for update
    public HangerDTO updateHanger(@RequestBody HangerDTO hangerDTO) {
        return hangerService.updateHanger(hangerDTO);
    }

    @DeleteMapping("/deletehanger")
    public boolean deleteHanger(@RequestBody HangerDTO hangerDTO) {
        return hangerService.deleteHanger(hangerDTO);
    }

    // pilot's details filter by using pilot_ID
    @GetMapping("/getHangerByHangerid/{hanger_id}")
    public HangerDTO getHangerByHangerid(@PathVariable String hanger_id) {
        return hangerService.gethangertById(hanger_id);
    }
}
