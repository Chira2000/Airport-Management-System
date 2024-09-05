package com.airportmanagementsystem.hangar_service.service;

import com.airportmanagementsystem.hangar_service.dto.HangerDTO;

import java.util.List;


public interface HangerService {

    List<HangerDTO> getAllHangers();
    HangerDTO addHanger(HangerDTO hangerDTO);
    HangerDTO updateHanger(HangerDTO hangerDTO);

    HangerDTO gethangertById(String hangerId);

    boolean deleteHanger(HangerDTO hangerDTO);
}
