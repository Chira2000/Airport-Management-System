//Data Transfer Object Package
package com.airportmanagementsystem.admin_service.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
//Attributes
public class AdminDTO {
    private int admin_id;
    private String admin_fullName;
    private String userName;
    private String admin_position;
    private String password;
    private String admin_email;
    private String admin_phone;
    private String admin_address;

}
