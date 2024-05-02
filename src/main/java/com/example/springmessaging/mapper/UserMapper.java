package com.example.springmessaging.mapper;

import com.example.springmessaging.dto.UserRequest;
import com.example.springmessaging.dto.UserResponse;
import com.example.springmessaging.model.User;

public class UserMapper {

  public User toEntity(UserRequest request) {
    return new User(0L, request.name(), request.email(), request.age());
  }

  public UserResponse toResponse(User user) {
    return new UserResponse(user.getId(), user.getName(), user.getEmail(), user.getAge());
  }
}
