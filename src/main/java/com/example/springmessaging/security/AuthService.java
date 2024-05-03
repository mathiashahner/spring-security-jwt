package com.example.springmessaging.security;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.example.springmessaging.dto.LoginResponse;
import com.example.springmessaging.mapper.LoginMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

  private final JwtService jwtService;

  public LoginResponse login(Authentication authentication) {
    String token = jwtService.generateToken(authentication);

    return LoginMapper.toResponse(token);
  }
}
