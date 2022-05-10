package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {
    @Test
    public void whenMan180Then92() {
        short height = 180;
        double expected = 92;
        double actual = Fit.manWeight(height);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short height = 170;
        double expected = 69;
        double actual = Fit.womanWeight(height);
        assertEquals(expected, actual, 0.01);
    }
}