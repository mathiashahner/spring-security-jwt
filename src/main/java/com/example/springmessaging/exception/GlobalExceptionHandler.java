package com.example.springmessaging.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(ResponseStatusException.class)
  public ResponseEntity<ApiError> handleResponseStatusException(ResponseStatusException exception) {
    return ResponseEntity
        .status(exception.getStatusCode())
        .body(new ApiError(exception.getReason()));
  }
}
