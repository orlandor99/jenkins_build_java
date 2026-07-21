package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void messageReturnsExpectedText() {
        assertEquals("Hello from Maven build!", App.message());
    }
}