package com.airportmanagementsystem.pilot_service.exception;
/**
 * Exception thrown when a requested resource (e.g., Pilot) is not found in the system.
 * <p>
 * This exception is used to indicate that the requested resource could not be found,
 * typically resulting in a 404 Not Found response.
 * </p>
 *
 * @author Tharusha Dilhara
 */
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
