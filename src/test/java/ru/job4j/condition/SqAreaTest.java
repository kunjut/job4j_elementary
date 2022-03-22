package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP13K7Square4dot62() {
        double expected = 4.62;
        int p = 13;
        double k = 7;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP30K70Square3dot12() {
        double expected = 3.12;
        int p = 30;
        double k = 70;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}