package ru.job4j.condition;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String result = DummyBot.answer(in);
        assertEquals(expected, result);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String result = DummyBot.answer(in);
        assertEquals(expected, result);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Сколько будет 2 + 2?";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String result = DummyBot.answer(in);
        assertEquals(expected, result);
    }
}