package com.airportmanagementsystem.vechicle_service.repository;

import com.airportmanagementsystem.vechicle_service.entity.Vechicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VechicleRepository extends JpaRepository<Vechicle, Integer> {
    // Repository for Vechicle entity
    // Provides CRUD operations
    Vechicle findByvehicleType(String vehicleType);
}
