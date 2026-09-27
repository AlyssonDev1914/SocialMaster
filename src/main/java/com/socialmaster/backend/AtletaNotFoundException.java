package com.socialmaster.backend;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class AtletaNotFoundException extends RuntimeException{

    public AtletaNotFoundException(String mensagem ){
        super(mensagem);
    }
}
