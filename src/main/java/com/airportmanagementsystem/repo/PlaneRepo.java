package com.airportmanagementsystem.repo;

import com.airportmanagementsystem.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepo extends JpaRepository<Plane,Integer> {
}
