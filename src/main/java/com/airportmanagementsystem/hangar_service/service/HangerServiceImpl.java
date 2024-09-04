package com.airportmanagementsystem.hangar_service.service;


import com.airportmanagementsystem.hangar_service.dto.HangerDTO;
import com.airportmanagementsystem.hangar_service.entity.Hanger;
import com.airportmanagementsystem.hangar_service.repository.HangerRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class HangerServiceImpl implements HangerService{

    @Autowired
    private HangerRepository hangerRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public HangerDTO addHanger(HangerDTO hangerDTO) {
        hangerRepository.save(modelMapper.map(hangerDTO, Hanger.class));
        return hangerDTO;
    }

    @Override
    public List<HangerDTO> getAllHangers() {
        List<Hanger> hangers = hangerRepository.findAll();
        return modelMapper.map(hangers, new TypeToken<List<HangerDTO>>() {}.getType());
    }

    @Override
    public HangerDTO updateHanger(HangerDTO hangerDTO) {
        hangerRepository.save(modelMapper.map(hangerDTO, Hanger.class));
        return hangerDTO;
    }

    @Override
    public boolean deleteHanger(HangerDTO hangerDTO) {
        hangerRepository.delete(modelMapper.map(hangerDTO, Hanger.class));
        return true;
    }

    @Override
    public HangerDTO gethangertById(String hangerId) {
        Hanger hanger = hangerRepository.getHangerByHangerid(hangerId);
        return modelMapper.map(hanger, HangerDTO.class);
    }


}
