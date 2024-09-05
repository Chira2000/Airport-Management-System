package com.airportmanagementsystem.admin_service.repository;
import com.airportmanagementsystem.admin_service.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
    Admin findByUserName(String userName);


}
