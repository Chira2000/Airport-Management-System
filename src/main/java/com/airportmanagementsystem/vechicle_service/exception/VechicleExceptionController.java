package com.airportmanagementsystem.vechicle_service.exception;

import com.airportmanagementsystem.vechicle_service.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(VechicleNotFoundException.class)
    public ResponseEntity<ApiResponse> handleVechicleNotFoundException(VechicleNotFoundException e) {
        ApiResponse response = new ApiResponse(e.getMessage(), false);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse> handleGeneralException(Exception e) {
        ApiResponse response = new ApiResponse("unexpected error", false);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
