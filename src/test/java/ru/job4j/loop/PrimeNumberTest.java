package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when5then3() {
        int in = 5;
        int result = PrimeNumber.calc(in);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void when11then5() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void when2then1() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        assertEquals(expected, result);
    }
}