package com.example.springmessaging.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("USERS")
public class User {

  @Id
  private Long id;
  private String name;
  private String email;
  private int age;
}
