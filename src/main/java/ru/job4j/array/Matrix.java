package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] arr = new int[size][size];
        for (int row = 0; row < arr.length; row++) {
            for (int cell = 0; cell < arr[row].length; cell++) {
                arr[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return arr;
    }
}