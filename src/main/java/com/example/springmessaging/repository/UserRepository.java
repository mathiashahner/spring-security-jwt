package com.example.springmessaging.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springmessaging.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
