package com.airportmanagementsystem.porter_service.repository;

import com.airportmanagementsystem.porter_service.entity.Porter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PorterRepository extends JpaRepository<Porter, Integer> {
    // Find Porter by employeeId
    Porter findByPorterId(int employeeId);
}
