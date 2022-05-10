package ru.job4j.array;

public class PrintEvenElements {
    public static String printEvenInts(int[] numbers) {
        String line = System.lineSeparator();
        String result = "Элементы массива с чётными индексами, начиная с последнего: " + line;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - 1 - i) % 2 == 0) {
                result += numbers[numbers.length - 1 - i] + line;
            }
        }
        return result;
    }
}