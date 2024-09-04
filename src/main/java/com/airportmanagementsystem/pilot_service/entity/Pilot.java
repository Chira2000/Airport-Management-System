package com.airportmanagementsystem.pilot_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pilot {
    @Id
    private int pilotId;
    private String pilotName;
    private String licencesNumber;
    private String email;
    private int phoneNumber;
    private Date hireDate;
    private Time flightHours;

}
