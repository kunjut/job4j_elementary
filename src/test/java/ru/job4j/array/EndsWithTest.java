package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {
    @Test
    public void whenEndWithPostfixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertTrue(result);
    }

    @Test
    public void whenEndWithPostfixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'i'};
        boolean result = EndsWith.endsWith(word, post);
        assertFalse(result);
    }
}