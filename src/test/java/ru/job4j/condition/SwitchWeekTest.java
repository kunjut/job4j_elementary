package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {
    @Test
    public void dayMonday() {
        int in = 1;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Понедельник";
        assertEquals(expected, result);
    }

    @Test
    public void dayTuesday() {
        int in = 2;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Вторник";
        assertEquals(expected, result);
    }

    @Test
    public void dayWednesday() {
        int in = 3;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Среда";
        assertEquals(expected, result);
    }

    @Test
    public void dayThursday() {
        int in = 4;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Четверг";
        assertEquals(expected, result);
    }

    @Test
    public void dayFriday() {
        int in = 5;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Пятница";
        assertEquals(expected, result);
    }

    @Test
    public void daySunday() {
        int in = 6;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Суббота";
        assertEquals(expected, result);
    }
    
    @Test
    public void daySaturday() {
        int in = 7;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Воскресенье";
        assertEquals(expected, result);
    }
}