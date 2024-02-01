package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void calcFactorial() {
        assertEquals(120,Factorial.calcFactorial(5));
        assertEquals(1,Factorial.calcFactorial(0));
        assertEquals(6,Factorial.calcFactorial(3));


    }
}