package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SkipNegativeTest {
    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] array = {
                {1, -2},
                {1, 2}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2}
        };
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenArrayRow4AndColumnNotEquals() {
        int[][] array = {
                {1, -2},
                {1, 2, -3},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2, 0},
                {1, 0, 3, 0},
                {1, 2, 0, 0, 5}
        };
        assertArrayEquals(expected, result);
    }

    @Test
    public void when5NegativeElements() {
        int[][] in = {
                {3, -1, 7},
                {-10, 5, 8, 8, -1},
                {-8, -8}
        };
        int[][] result = SkipNegative.skip(in);
        int[][] expected = {
                {3, 0, 7},
                {0, 5, 8, 8, 0},
                {0, 0}
        };
        assertArrayEquals(expected, result);

    }

}