package com.airportmanagementsystem.admin_service.entity;

import jakarta.persistence.Entity;
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
private int admin_id;
private String admin_name;
private String admin_position;
}
