package com.airportmanagementsystem.porter_service.exception;

public class PorterNotFoundException extends RuntimeException {
    public PorterNotFoundException(String message){
        super(message);
    }
}
