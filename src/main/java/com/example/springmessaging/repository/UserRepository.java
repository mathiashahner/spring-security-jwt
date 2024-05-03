package com.example.springmessaging.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.springmessaging.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

  Optional<User> findByEmail(String email);
}
