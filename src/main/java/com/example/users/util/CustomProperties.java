package com.example.users.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomProperties {
    private final String minAge;

    public CustomProperties(@Value("${min-age}") String minAge) {
        this.minAge = minAge;
    }

    public String getMinAge() {
        return minAge;
    }
}