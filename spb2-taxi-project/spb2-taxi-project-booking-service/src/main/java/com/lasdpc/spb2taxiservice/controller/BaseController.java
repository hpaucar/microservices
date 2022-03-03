package com.lasdpc.spb2taxiservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lasdpc.spb2taximodel.dto.response.ErrorDTO;
import com.lasdpc.spb2taxiservice.exception.TaxiBookingIdNotFoundException;

@ControllerAdvice
public class BaseController {

    @ExceptionHandler(TaxiBookingIdNotFoundException.class)
    public ResponseEntity<ErrorDTO> handleTaxiBookingIdNotFoundException(TaxiBookingIdNotFoundException e) {
        return new ResponseEntity<ErrorDTO>(new ErrorDTO(e.getMessage(), HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
    }
}
