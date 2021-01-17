package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            if (!isAvailable(right, left[i])) {
                //array[index] = left[i];
                index++;
            }
        }
        int[] array = new int[index];
        index = 0;

        for (int i = 0; i < left.length; i++) {
            if (!isAvailable(right, left[i])) {
                array[index] = left[i];
                index++;
            }
        }
        return array;
    }

    public static boolean isAvailable(int[] array, int num) {
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}