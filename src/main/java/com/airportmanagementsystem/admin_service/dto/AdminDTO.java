package com.airportmanagementsystem.admin_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminDTO {
    private int admin_id;
    private String admin_name;
    private String admin_position;

}
