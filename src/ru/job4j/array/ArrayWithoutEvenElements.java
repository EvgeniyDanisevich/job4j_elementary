package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int value = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                value++;
            }
        }
        int[] array = new int[value];
        value = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                array[value] = data[i];
                value++;
            }
        }
        return array;
    }
}