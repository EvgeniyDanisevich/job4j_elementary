package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            if (!isBothAvailable(left, right, left[i])) {
                index++;
            }
        }
        for (int i = 0; i < right.length; i++) {
            if (!isBothAvailable(right, left, right[i])) {
                index++;
            }
        }
        int[] array = new int[index];
        index = 0;
        for (int i = 0; i < left.length; i++) {
            if (!isBothAvailable(left, right, left[i])) {
                array[index] = left[i];
                index++;
            }
        }
        for (int i = 0; i < right.length; i++) {
            if (!isBothAvailable(right, left, right[i])) {
                array[index] = right[i];
                index++;
            }
        }
        return array;
    }

    public static boolean isBothAvailable(int[] left, int[] right, int num) {
        boolean flag = false;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j] && left[i] == num) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}