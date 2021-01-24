package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloSibylleTest {
    @Test
    public void testGetMessage() {
        assertEquals("Hello Sibylle", HelloSibylle.getMessage());
    }
}
