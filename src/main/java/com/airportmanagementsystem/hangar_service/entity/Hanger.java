package com.airportmanagementsystem.hangar_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
//
public class Hanger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hanger_id;
    private String location;
    private String size; // Dimensions or capacity as a String
    private String type; // Maintenance, storage, etc.
    private boolean Occupied_Status;
    private String operator;
    private String supported_aircraft_types;
    private String maintenance_facilities;
    private String availability;
}
