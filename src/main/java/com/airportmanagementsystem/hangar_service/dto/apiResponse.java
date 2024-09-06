package com.airportmanagementsystem.hangar_service.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class apiResponse {

    private  String message;
    private  boolean success;

}
