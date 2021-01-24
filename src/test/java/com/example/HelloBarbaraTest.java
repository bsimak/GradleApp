package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloBarbaraTest {
    @Test
    public void testGetMessage() {
        assertEquals("Hello Barbara", HelloBarbara.getMessage());
    }
}
