package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        return rsl;
    }

    public static boolean flag(int[] array, int num) {
      boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                flag = true;
            }
        }
      return flag;
    }
}
