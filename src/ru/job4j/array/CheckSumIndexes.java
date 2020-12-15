package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int check = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (sum == (i + j)) {
                    data[i][j] = 0;
                } else {
                    check++;
                }
            }
        }
        int[] array = new int[check];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != 0) {
                    array[index] = data[i][j];
                    index++;
                }
            }
        }
        return array;
    }
}