package com.devteria.identityservice.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {

    @Size(min = 3, message = "USERNAME_INVALID")
    private String username;
    @Size(min = 8, message = "PASSWORD_INVALID")
    private String password;
    private String firstName;
    private final String  lastName;
    private LocalDate dob;
}
