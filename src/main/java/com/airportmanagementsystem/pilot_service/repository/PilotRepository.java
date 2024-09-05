package com.airportmanagementsystem.pilot_service.repository;

import com.airportmanagementsystem.pilot_service.entity.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Repository interface for performing CRUD operations on the {@link Pilot} entity.
 * <p>
 * This interface extends {@link JpaRepository}, providing built-in methods for data access.
 * Additional custom query methods can be defined here.
 * </p>
 *
 * @author Tharusha Dilhara
 */

public interface PilotRepository extends JpaRepository<Pilot, Integer> { //<entity name, PK data type

    // For Native Query // pilot's details filter by using pilot_ID
    @Query(value = "SELECT * FROM pilot WHERE pilot_id = ?1",nativeQuery = true)
    Pilot getPilotByPilotID(String pilotId);

}
