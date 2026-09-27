package com.socialmaster.backend;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionHandler {
    @ExceptionHandler(AtletaNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String tratarAtletaNaoEncontrado(AtletaNotFoundException ex){
        return ex.getMessage();
    }
}
