//Admin Service Entity Package
package com.airportmanagementsystem.admin_service.entity;
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
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Incremented Attribute for Admin ID
private int admin_id;
private String admin_fullName;
private String userName;
private String admin_position;
private String password;
private String admin_email;
private String admin_phone;
private String admin_address;


}
