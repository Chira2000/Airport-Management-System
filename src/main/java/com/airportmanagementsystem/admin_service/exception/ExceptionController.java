package com.airportmanagementsystem.admin_service.exception;

import com.airportmanagementsystem.admin_service.dto.apiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(AdminNotFoundException.class)
    public ResponseEntity<apiResponse> handleadminNotFoundException(AdminNotFoundException e) {
        apiResponse response = new apiResponse(e.getMessage(), false);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<apiResponse> handleGenaralException(Exception e) {
        apiResponse response = new apiResponse("unexpected error", false);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}



