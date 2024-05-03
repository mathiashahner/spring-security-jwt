package com.example.springmessaging.mapper;

import com.example.springmessaging.dto.UserResponse;
import com.example.springmessaging.model.User;

public class UserMapper {

  public static UserResponse toResponse(User user) {
    return new UserResponse(user.getId(), user.getName(), user.getEmail());
  }
}
