package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {
    @Test
    public void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int d = 2;
        int expected = 40;
        int actual = X2.calc(a, b, c, d);
        assertEquals(expected, actual);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int expected = 3;
        int actual = X2.calc(a, b, c, d);
        assertEquals(expected, actual);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 1;
        int expected = 2;
        int actual = X2.calc(a, b, c, d);
        assertEquals(expected, actual);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int d = 1;
        int expected = 2;
        int actual = X2.calc(a, b, c, d);
        assertEquals(expected, actual);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 0;
        int expected = 1;
        int actual = X2.calc(a, b, c, d);
        assertEquals(expected, actual);
    }
}