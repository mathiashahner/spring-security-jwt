package com.example.springmessaging.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.springmessaging.dto.UserResponse;
import com.example.springmessaging.mapper.UserMapper;
import com.example.springmessaging.model.User;
import com.example.springmessaging.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public UserResponse getUser(Long id) {
    User user = userRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found!"));

    return UserMapper.toResponse(user);
  }

  public List<UserResponse> getAllUsers() {
    Iterable<User> users = userRepository.findAll();
    List<UserResponse> response = new ArrayList<>();

    users.iterator().forEachRemaining(user -> response
        .add(UserMapper.toResponse(user)));

    return response;
  }
}
