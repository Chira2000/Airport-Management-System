package com.airportmanagementsystem.porter_service.entity;

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
public class Porter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int porterId;
    private String name;
    private String shift;
    private Number contactNumber;
    private String email;
    private String position;
    private String workLocation;
}
