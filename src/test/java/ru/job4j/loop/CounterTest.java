package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromMinus10To4ThenMinus24() {
        int start = -10;
        int finish = 4;
        int result = Counter.sumByEven(start, finish);
        int expected = -24;
        assertEquals(expected, result);
    }
}