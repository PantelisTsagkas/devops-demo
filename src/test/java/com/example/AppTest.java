package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        App.main(new String[]{}); // Call the main method
        assertTrue(true); // A simple assertion that always passes
    }
}

