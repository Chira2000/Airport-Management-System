package com.airportmanagementsystem.pilot_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
/**
 * Represents a Pilot entity in the system.
 * <p>
 * This class is a JPA entity that maps to a database table for storing pilot details.
 * It uses Lombok to generate boilerplate code like getters, setters, and constructors.
 * </p>
 *
 * @author Tharusha Dilhara
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pilot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pilot_id;
    private String pilot_name;
    private String licences_number;
    private String email;
    private int phone_number;
    private Date hire_date;
    private Time flight_hours;
}
