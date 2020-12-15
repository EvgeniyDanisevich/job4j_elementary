package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        String string = Integer.toString(number);
        char[] chars = string.toCharArray();
        int[] array = new int[chars.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.getNumericValue(chars[chars.length - 1 - i]);
        }
        return array;
    }
}