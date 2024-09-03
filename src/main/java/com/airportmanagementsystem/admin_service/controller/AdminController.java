//Admin Service Controller Package
package com.airportmanagementsystem.admin_service.controller;
import com.airportmanagementsystem.admin_service.dto.AdminDTO;
import com.airportmanagementsystem.admin_service.dto.AdminLogin;
import com.airportmanagementsystem.admin_service.dto.apiResponse;
import com.airportmanagementsystem.admin_service.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
//Base API
@RequestMapping(value="api/v1/admin")
@CrossOrigin
//Add Comments

public class AdminController {
    @Autowired
    AdminService adminService;
    //Get Request API Endpoint
    @GetMapping("/showadmin")
    public List<AdminDTO> getAdmin() {
        return adminService.getAllAdmins();
    }

    //Post Request API Endpoint
    @PostMapping("/saveadmin")
        public apiResponse saveAdmin
        (@RequestBody AdminDTO adminDTO)
    {
        return adminService.saveAdmin(adminDTO);
}
    //Put Request API Endpoint
@PutMapping("/updateadmin")
        public apiResponse updateAdmin(@RequestBody AdminDTO adminDTO){
        return adminService.updateAdmin(adminDTO);
}
    //Delete Request API Endpoint
@DeleteMapping("/deleteadmin/{admin_id}")
   public  apiResponse deleteAdmin(@PathVariable int admin_id){
    boolean isDeleted = adminService.deleteAdmin(admin_id);

    if (isDeleted) {
        return new apiResponse("Admin deleted successfully", true);
    } else {
        return new apiResponse("Admin not found", false);
    }
}

   //Admin Login API Endpoint
@PostMapping("/loginadmin")
    public apiResponse loginAdmin(@RequestBody AdminLogin adminlogin){
        return adminService.loginAdmin(adminlogin);

}



}
