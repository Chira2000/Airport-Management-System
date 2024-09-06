package com.airportmanagementsystem.vechicle_service.dto;

public class ApiResponse {
    private String message;
    private boolean success;

    // Constructor with parameters
    public ApiResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}