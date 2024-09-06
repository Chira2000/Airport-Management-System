package com.airportmanagementsystem.hangar_service.exception;

public class HangerNotFoundException extends RuntimeException {

    public HangerNotFoundException(String message) {
        super(message);
    }
}
