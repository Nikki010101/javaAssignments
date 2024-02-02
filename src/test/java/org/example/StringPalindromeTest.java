package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPalindromeTest {

    @Test
    void checkStringPalindrome() {
        assertFalse(StringPalindrome.checkStringPalindrome("book"));
        assertTrue(StringPalindrome.checkStringPalindrome("evE"));
    }
}