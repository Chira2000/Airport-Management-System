package com.airportmanagementsystem.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PlaneDTO {
    private  int  planeid;
    private String model;
    private String manufacrurer;
    private int yearofmanafacturer;
    private int  seatingcapacity;
    private float fuelcapacity;

}

