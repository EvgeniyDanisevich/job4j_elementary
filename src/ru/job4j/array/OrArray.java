package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] buffer = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
                buffer[i] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            buffer[i + left.length] = right[i];
        }
        int lengthTarget = buffer.length;
        for (int i : left) {
            for (int j : right) {
                if (i == j) {
                    lengthTarget--;
                }
            }
        }
        int[] targetArray = new int[lengthTarget];
        int index = 0;

        for (int i = 0; i < buffer.length; i++) {
            if (!flag(targetArray, buffer[i])) {
                targetArray[index] = buffer[i];
                index++;
            }
        }
        return targetArray;
    }

    public static boolean flag(int[] array, int num) {
        boolean isAvailable = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                isAvailable = true;
            }
        }
        return isAvailable;
    }
}

