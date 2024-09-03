package com.airportmanagementsystem.admin_service.service;

import com.airportmanagementsystem.admin_service.dto.AdminDTO;
import com.airportmanagementsystem.admin_service.dto.AdminLogin;
import com.airportmanagementsystem.admin_service.dto.apiResponse;
import com.airportmanagementsystem.admin_service.entity.Admin;
import com.airportmanagementsystem.admin_service.exception.AdminNotFoundException;
import com.airportmanagementsystem.admin_service.repository.AdminRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
@Autowired
    private AdminRepository adminRepository;

@Autowired
    private ModelMapper modelMapper;

@Autowired
    private BCryptPasswordEncoder passwordEncoder;

@Override
    public List<AdminDTO> getAllAdmins() {
    List<Admin> admins = adminRepository.findAll();
    return admins.stream()
            .map(admin -> modelMapper.map(admin, AdminDTO.class))
            .collect(Collectors.toList());
}
@Override
    public apiResponse saveAdmin(AdminDTO adminDTO) {
        Admin admin = modelMapper.map(adminDTO, Admin.class);
        admin.setPassword(passwordEncoder.encode(adminDTO.getPassword()));  // Hash the password
        adminRepository.save(admin);
        return new apiResponse("Admin Saved Sucessfully",true);
    }
    @Override
    public apiResponse updateAdmin(AdminDTO adminDTO) {
        if (!adminRepository.existsById(adminDTO.getAdmin_id())) {
            throw new AdminNotFoundException("Admin with ID " + adminDTO.getAdmin_id() + " not found");
        }
        adminRepository.save(modelMapper.map(adminDTO, Admin.class));
        return new apiResponse("Admin Updated Successfully", true);
    }

    @Override

    public boolean deleteAdmin(int admin_id) {
        if (!adminRepository.existsById(admin_id)) {
            throw new AdminNotFoundException("Admin with ID " + admin_id + " not found");
        }
        adminRepository.deleteById(admin_id);
        return true;
    }

    @Override

    public apiResponse loginAdmin(AdminLogin adminlogin) {
        Admin admin = adminRepository.findByUserName(adminlogin.getUserName());
        if (admin == null && passwordEncoder.matches(adminlogin.getPassword(),adminlogin.getPassword())) {
            return new apiResponse("Admin Logged In Sucessfully",true);
        }
        else{
            return new apiResponse("Admin Not Found",false);
        }

    }













}
