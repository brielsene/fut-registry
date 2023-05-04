package br.com.fut.futregistry.configuration.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class TratamentoDeErros {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity trataErro404(NoSuchElementException exception){
        return ResponseEntity.noContent().build();

    }
}
