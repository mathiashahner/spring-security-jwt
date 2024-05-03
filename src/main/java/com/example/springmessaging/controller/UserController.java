package com.example.springmessaging.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmessaging.dto.UserResponse;
import com.example.springmessaging.service.UserService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@SecurityRequirement(name = "Bearer")
public class UserController {

  private final UserService userService;

  @GetMapping("/{id}")
  public UserResponse getUser(@PathVariable Long id) {
    return userService.getUser(id);
  }

  @GetMapping
  public List<UserResponse> getAllUsers() {
    return userService.getAllUsers();
  }
}
