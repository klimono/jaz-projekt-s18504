package com.example.projektBank;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class ExpectionHandler {
    @ExceptionHandler(HttpClientErrorException.class)
    ResponseEntity<String> HandlerRuntimeExecption(HttpClientErrorException exception) {


        switch (exception.getStatusCode()){
            case NO_CONTENT:
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("kod204");
            case BAD_REQUEST:
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("kod400");
            case NOT_FOUND:
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("kod404");
            case INTERNAL_SERVER_ERROR :
                return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("kod500");
        }
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("kod502");
    }
}
