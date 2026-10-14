package com.socialmaster.backend;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException; // NOVO: importa a exceção de validação

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(AtletaNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String tratarAtletaNaoEncontrado(AtletaNotFoundException ex) {
        return ex.getMessage(); // MANTIDO: retorna a mensagem da exceção
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST) // NOVO: retorna HTTP 400
    public String tratarErroValidacao(MethodArgumentNotValidException ex) {
        // NOVO: retorna a mensagem do primeiro campo inválido
        return ex.getBindingResult()
                .getFieldErrors()
                .get(0)
                .getDefaultMessage();
    }
}