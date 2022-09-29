package com.example.users.validator;

import com.example.users.util.CustomProperties;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class AgeValidator implements ConstraintValidator<ValidAge, LocalDate> {

    @Autowired
    private CustomProperties properties;

    @Override
    public boolean isValid(LocalDate field, ConstraintValidatorContext context) {
        int minAge = Integer.parseInt(properties.getMinAge());
        int year = field.getYear();
        return minAge <= year;
    }
}
