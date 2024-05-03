package com.example.springmessaging.mapper;

import com.example.springmessaging.dto.LoginResponse;

public class LoginMapper {

  public static LoginResponse toResponse(String token) {
    return new LoginResponse(token);
  }
}
