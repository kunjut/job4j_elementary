package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2, 1};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {5, 4, 3, 2, 1};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertEquals(expected, result);
    }
}