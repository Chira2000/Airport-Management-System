package com.airportmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Plane {
    @Id
    private  int  planeid;
    private String model;
    private String manufacrurer;
    private int yearofmanafacturer;
    private int  seatingcapacity;
    private float fuelcapacity;



}
