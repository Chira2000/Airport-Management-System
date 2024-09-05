package com.airportmanagementsystem.service;

import com.airportmanagementsystem.dto.PlaneDTO;
import com.airportmanagementsystem.entity.Plane;
import com.airportmanagementsystem.repo.PlaneRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class PlaneService {

    @Autowired
    private PlaneRepo planeRepo;

    @Autowired
    private ModelMapper modelMapper;

    public PlaneDTO savePlane(PlaneDTO planeDTO){
        planeRepo.save(modelMapper.map(planeDTO, Plane.class));
        return  planeDTO;
    }

    public List<PlaneDTO> getAllPlane(){
     List<Plane>planeList=planeRepo.findAll();
        return modelMapper.map(planeList, new TypeToken<List<PlaneDTO>>(){}.getType());
    }

    public PlaneDTO updatePlane(PlaneDTO planeDTO){
        planeRepo.save(modelMapper.map(planeDTO, Plane.class));
        return planeDTO;
    }

    public boolean deletePlane(PlaneDTO planeDTO){
        planeRepo.delete(modelMapper.map(planeDTO, Plane.class));
        return true;
    }

}
