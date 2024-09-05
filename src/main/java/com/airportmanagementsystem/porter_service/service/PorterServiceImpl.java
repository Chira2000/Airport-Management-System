package com.airportmanagementsystem.porter_service.service;

import com.airportmanagementsystem.porter_service.dto.PorterDTO;
import com.airportmanagementsystem.porter_service.entity.Porter;
import com.airportmanagementsystem.porter_service.repository.PorterRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PorterServiceImpl implements PorterService {

    @Autowired
    private PorterRepository porterRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<PorterDTO> getAllPorters(){
        List<Porter>porterList = porterRepository.findAll();
        return modelMapper.map(porterList, new TypeToken<List<PorterDTO>>(){}.getType());
    }

    @Override
    public PorterDTO savePorter(PorterDTO porterDTO){
        porterRepository.save(modelMapper.map(porterDTO, Porter.class));
        return porterDTO;
    }

    @Override
    public PorterDTO updatePorter(PorterDTO porterDTO){
        porterRepository.save(modelMapper.map(porterDTO, Porter.class));
        return porterDTO;
    }

    @Override
    public boolean deletePorter(int porterId) {
        if(porterRepository.existsById(porterId)){
            porterRepository.deleteById(porterId);
            return true;
        }
        return false;
    }

    @Override
    public PorterDTO getPorterById(int porterId) {
        Porter porter = porterRepository.findByPorterId(porterId);
        return modelMapper.map(porter, PorterDTO.class);
    }

}
