package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] array = {1, 2, 3, 4};
        int source = 0;
        int dest = array.length - 1;
        int[] result = SwitchArray.swap(array, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to0() {
        int[] array = {1, 2, 3, 4, 5};
        int source = 2;
        int dest = 0;
        int[] result = SwitchArray.swap(array, source, dest);
        int[] expected = {3, 2, 1, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to3() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(array, source, dest);
        int[] expected = {1, 2, 4, 3, 5, 6};
        assertArrayEquals(expected, result);
    }
}