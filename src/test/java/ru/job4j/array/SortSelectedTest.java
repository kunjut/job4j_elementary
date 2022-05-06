package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5Elements() {
        int[] in = {8, 3, 1, 6, 2};
        int[] result = SortSelected.sort(in);
        int[] expected = {1, 2, 3, 6, 8};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3Elements() {
        int[] in = {6, 4, 2};
        int[] result = SortSelected.sort(in);
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayWithBothElements() {
        int[] in = {6, 6, 4, 4, 2, 2};
        int[] result = SortSelected.sort(in);
        int[] expected = {2, 2, 4, 4, 6, 6};
        assertArrayEquals(expected, result);
    }
}