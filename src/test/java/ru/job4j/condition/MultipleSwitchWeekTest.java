package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {
    @Test
    public void dayMondayRu() {
        String in = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void dayMondayEn() {
        String in = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void dayTuesdayRu() {
        String in = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void dayTuesdayEn() {
        String in = "Tuesday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void dayWednesdayRu() {
        String in = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void dayWednesdayEn() {
        String in = "Wednesday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void dayThursdayRu() {
        String in = "Четверг";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void dayThursdayEn() {
        String in = "Thursday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void dayFridayRu() {
        String in = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void dayFridayEn() {
        String in = "Friday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void daySundayRu() {
        String in = "Суббота";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    public void daySundayEn() {
        String in = "Sunday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    public void daySaturdayRu() {
        String in = "Воскресенье";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 7;
        assertEquals(expected, result);
    }

    @Test
    public void daySaturdayEn() {
        String in = "Saturday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 7;
        assertEquals(expected, result);
    }
}