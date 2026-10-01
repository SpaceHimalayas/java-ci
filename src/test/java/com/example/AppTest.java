package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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

    @Test
    void mainRunsWithoutError() {
        App.main(new String[0]);
    }

    @Test
    void appCanBeCreated() {
        assertNotNull(new App());
    }
}