package com.example.users.util;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties="min-age=18")
class CustomPropertiesTest {
    @Autowired
    CustomProperties properties;

    @Test
    public void testValueSetup() {
        assertEquals("18", properties.getMinAge());
    }
}