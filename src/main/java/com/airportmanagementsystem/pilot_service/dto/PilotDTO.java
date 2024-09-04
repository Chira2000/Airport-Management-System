package com.airportmanagementsystem.pilot_service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PilotDTO {
    private int pilotId;
    private String pilotName;
    private String licencesNumber;
    private String email;
    private int phoneNumber;
    private Date hireDate;
    private Time flightHours;
}
