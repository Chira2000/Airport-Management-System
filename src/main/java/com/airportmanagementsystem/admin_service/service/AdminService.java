package com.airportmanagementsystem.admin_service.service;

import com.airportmanagementsystem.admin_service.dto.AdminDTO;
import com.airportmanagementsystem.admin_service.dto.AdminLogin;
import com.airportmanagementsystem.admin_service.dto.apiResponse;

import java.util.List;

public interface AdminService {

    List<AdminDTO> getAllAdmins();
    apiResponse saveAdmin(AdminDTO adminDTO);
    apiResponse updateAdmin(AdminDTO adminDTO);
    boolean deleteAdmin(int admin_id);
    apiResponse loginAdmin(AdminLogin adminlogin);
}
