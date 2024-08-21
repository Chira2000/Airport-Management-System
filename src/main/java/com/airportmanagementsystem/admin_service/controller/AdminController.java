package com.airportmanagementsystem.admin_service.controller;

import com.airportmanagementsystem.admin_service.dto.AdminDTO;
import com.airportmanagementsystem.admin_service.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="api/v1/admin")
@CrossOrigin

public class AdminController {
    @Autowired
    AdminService adminService;
    @PostMapping("/saveadmin")
        public AdminDTO saveAdmin
        (@RequestBody AdminDTO adminDTO)
    {
        return adminService.saveAdmin(adminDTO);
}



}
