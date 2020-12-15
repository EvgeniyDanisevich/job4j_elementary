package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] array = new int[2 + (middle.length / 2) + (right.length / 2)];
        int value = 2;
        array[0] = left[0];
        array[array.length - 1] = left[left.length - 1];
        for (int i = 0; i < middle.length; i++) {
            if (i % 2 != 0) {
                array[value] = middle[i];
                value = value + 2;
            }
        }
        value = 1;
        for (int i = 0; i < right.length; i++) {
            if (i % 2 == 0) {
                array[value] = right[i];
                value = value + 2;
            }
        }
        return array;
    }
}