package com.airportmanagementsystem.pilot_service.repo;

import com.airportmanagementsystem.pilot_service.entity.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PilotRepo extends JpaRepository<Pilot, Integer> { //<entity name, PK data type

    // For Native Query // pilot's details filter by using pilot_ID
    @Query(value = "SELECT * FROM pilot WHERE pilot_id = ?1",nativeQuery = true)
    Pilot getPilotByPilotID(String pilotId);

}
