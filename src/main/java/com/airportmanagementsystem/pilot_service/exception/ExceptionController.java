package com.airportmanagementsystem.pilot_service.exception;

import com.airportmanagementsystem.pilot_service.dto.apiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionController {

    // Handle specific exception
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<apiResponse> handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        apiResponse response = new apiResponse(ex.getMessage(), false);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    // Handle global exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<apiResponse> handleGlobalException(Exception ex, WebRequest request) {
        apiResponse response = new apiResponse("An unexpected error occurred", false);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
