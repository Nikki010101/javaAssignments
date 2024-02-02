package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordsTest {

    @Test
    void uniqueWordsCount() {
        assertEquals(Map.of("all", 2, "is", 1, "so", 1),UniqueWords.uniqueWordsCount("all is so all"));
    }
}