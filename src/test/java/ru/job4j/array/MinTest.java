package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] in = {1, 2, 3, 4, 5};
        int result = Min.findMin(in);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] in = {1, 2, 3, 4, 5, 0};
        int result = Min.findMin(in);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] in = {10, 20, 3, 40, 50};
        int result = Min.findMin(in);
        int expected = 3;
        assertEquals(expected, result);
    }
}