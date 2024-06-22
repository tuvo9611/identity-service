package com.devteria.identityservice.dto.response;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    String username;
    String firstName;
    String lastName;
    LocalDate dob;
    Set<String> roles;
}