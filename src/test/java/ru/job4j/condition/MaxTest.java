package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTest {
    @Test
    public void whenRightFromTwoGreater() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenLeftFromTwoGreater() {
        int first = 2;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenEqualsFromTwo() {
        int first = 2;
        int right = 2;
        int result = Max.max(first, right);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenFirstFromThreeGreater() {
        int first = 7;
        int second = 1;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertEquals(result, expected);
    }

    @Test
    public void whenEqualsFromThree() {
        int first = 7;
        int second = 7;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertEquals(result, expected);
    }

    @Test
    public void whenThirdFromFourGreater() {
        int first = 7;
        int second = 1;
        int third = 11;
        int fourth = 6;
        int result = Max.max(first, second, third, fourth);
        int expected = 11;
        assertEquals(result, expected);
    }

    @Test
    public void whenEqualsFromFour() {
        int first = 11;
        int second = 11;
        int third = 11;
        int fourth = 11;
        int result = Max.max(first, second, third, fourth);
        int expected = 11;
        assertEquals(result, expected);
    }
}