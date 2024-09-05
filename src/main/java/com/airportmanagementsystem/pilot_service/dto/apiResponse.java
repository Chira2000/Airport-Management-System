package com.airportmanagementsystem.pilot_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * This class represents an API response object that is used to send structured
 * responses back to the client.
 *
 * It includes a message and a success flag to indicate whether the API request
 * was successful or not.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class apiResponse {
    /**
     * The message of the response, which provides additional information about
     * the outcome of the API request.
     */
    private String message;

    /**
     * A boolean flag indicating whether the API request was successful.
     * If true, the request was successful. If false, the request failed.
     */
    private boolean success;
}
