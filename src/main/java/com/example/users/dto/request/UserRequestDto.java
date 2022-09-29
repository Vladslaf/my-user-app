package com.example.users.dto.request;

import com.example.users.validator.ValidEmail;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class UserRequestDto {
    @NotNull
    @ValidEmail
    private String email;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private LocalDate birthDate;
    private String address;
    private String phone;
}
