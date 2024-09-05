package com.airportmanagementsystem.porter_service.service;

import com.airportmanagementsystem.porter_service.dto.PorterDTO;
import java.util.List;

public interface PorterService {
    //Method to retrive all porters
    List<PorterDTO> getAllPorters();

    //Method to save porters
    PorterDTO savePorter(PorterDTO porterDTO);

    //Method to update a porter
    PorterDTO updatePorter(PorterDTO porterDTO);

    //Method to delete a porter
    boolean deletePorter(int porterId);

    //Method to get a porter by ID
    PorterDTO getPorterById(int porterId);


}
