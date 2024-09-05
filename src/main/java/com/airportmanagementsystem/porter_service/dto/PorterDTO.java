package com.airportmanagementsystem.porter_service.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PorterDTO {
    private int porterId;
    private String name;
    private String shift;
    private Number contactNumber;
    private String email;
    private String position;
    private String workLocation;
}
