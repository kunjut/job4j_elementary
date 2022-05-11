package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23to41then2dot82() {
        Point a = new Point(2, 3);
        Point b = new Point(4, 1);
        double expected = 2.82;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when04to00then4() {
        Point a = new Point(0, 4);
        Point b = new Point(0, 0);
        double expected = 4;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}