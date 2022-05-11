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

    @Test
    public void when3dFrom457to132then6dot16() {
        Point a = new Point(4, 5, 7);
        Point b = new Point(1, 3, 2);
        double expected = 6.16;
        double out = a.distance3d(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3dFrom202to11010then12dot04() {
        Point a = new Point(2, 0, 2);
        Point b = new Point(11, 0, 10);
        double expected = 12.04;
        double out = a.distance3d(b);
        assertEquals(expected, out, 0.01);
    }
}