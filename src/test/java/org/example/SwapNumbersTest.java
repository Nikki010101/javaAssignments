package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNumbersTest {

    @Test
    void swapping() {
       assertArrayEquals(new int[]{10,6},SwapNumbers.swapping(6,10));

    }
}