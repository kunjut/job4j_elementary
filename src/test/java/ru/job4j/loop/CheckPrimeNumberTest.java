package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5isPrime() {
        int in = 5;
        boolean result = CheckPrimeNumber.isPrime(in);
        assertTrue(result);
    }

    @Test
    public void when4isNotPrime() {
        int in = 4;
        boolean result = CheckPrimeNumber.isPrime(in);
        assertFalse(result);
    }

    @Test
    public void when1isNotPrime() {
        int in = 1;
        boolean result = CheckPrimeNumber.isPrime(in);
        assertFalse(result);
    }
}