package com.airportmanagementsystem.hangar_service.exception;

import com.airportmanagementsystem.hangar_service.dto.apiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HangerExceptionController {
    @ExceptionHandler(HangerNotFoundException.class)
    public ResponseEntity<apiResponse> hangerNotFoundException(HangerNotFoundException e) {
        apiResponse response = new apiResponse (e.getMessage(),false);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);


    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<apiResponse> hangerNotFoundException(Exception e) {

        apiResponse response = new apiResponse("unexpected error", false);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
