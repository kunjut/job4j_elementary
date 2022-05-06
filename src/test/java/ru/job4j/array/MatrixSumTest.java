package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {
    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum.sum(array);
        int expected = 10;
        assertEquals(expected, result);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int result = MatrixSum.sum(array);
        int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int result = MatrixSum.sum(array);
        int expected = 7;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumOf9ElemsIs27() {
        int[][] in = {
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3}
        };
        int result = MatrixSum.sum(in);
        int expected = 27;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumOf9ElemsIs19() {
        int[][] in = {
                {1, 2, 3},
                {4, 5},
                {1, 1, 1, 1}
        };
        int result = MatrixSum.sum(in);
        int expected = 19;
        assertEquals(expected, result);
    }
}