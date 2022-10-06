package com.example.users.dto.request;

import com.example.users.validator.ValidAge;
import com.example.users.validator.ValidEmail;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class UserRequestDto {
    @NotNull
    @ValidEmail
    private String email;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    @ValidAge
    private LocalDate birthDate;
    private String address;
    private String phone;
}
