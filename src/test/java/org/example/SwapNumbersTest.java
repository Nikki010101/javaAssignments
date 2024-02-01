package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNumbersTest {

    @Test
    void swapping() {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int[] result = SwapNumbers.swapping(a, b);
        a = result[0];
        b = result[1];
        assertEquals(10, a);
        assertEquals(5, b);
        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}