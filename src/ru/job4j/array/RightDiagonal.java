package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] array = new int[data.length];
        int row = 0;
        int column = data.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = data[row + i][column - i];
        }
        return array;
    }
}
