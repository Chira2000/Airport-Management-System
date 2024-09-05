package com.airportmanagementsystem.hangar_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data


public class HangerDTO {
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
