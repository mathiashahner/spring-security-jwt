package com.example.springmessaging.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(ResponseStatusException.class)
  public ResponseEntity<ApiError> handleResponseStatusException(ResponseStatusException exception) {
    return ResponseEntity
        .status(exception.getStatusCode())
        .body(new ApiError(exception.getReason()));
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ApiError> handleException(Exception exception) {
    String message = "Erro inesperado!";
    log.error(message, exception);

    return ResponseEntity
        .internalServerError()
        .body(new ApiError(message));
  }
}
