package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void greetReturnsMessage() {
        assertEquals("Hello, Team!", App.greet("Team"));
    }

    @Test
    void addAddsNumbers() {
        assertEquals(5, App.add(2, 3));
    }
}