package com.airportmanagementsystem.hangar_service.repository;

import com.airportmanagementsystem.hangar_service.entity.Hanger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HangerRepository extends JpaRepository<Hanger,Integer>{

    @Query(value = "SELECT * FROM hanger WHERE hanger_id = ?1",nativeQuery = true)
    Hanger getHangerByHangerid(String hanger_id);
}
