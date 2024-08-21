package com.airportmanagementsystem.admin_service.service;

import com.airportmanagementsystem.admin_service.dto.AdminDTO;
import com.airportmanagementsystem.admin_service.entity.Admin;
import com.airportmanagementsystem.admin_service.repository.AdminRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AdminService {
    @Autowired
   private AdminRepository adminRepository;
    @Autowired
    private ModelMapper modelMapper;
    public AdminDTO saveAdmin(AdminDTO adminDTO) {
        adminRepository.save(modelMapper.map(adminDTO, Admin.class));
        return adminDTO;
    }
}
