package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int value = (int) Math.ceil(Math.sqrt(array.length));
        int[][] squareArray = new int[value][value];
        int index = 0;
        for (int j = 0; j < squareArray.length; j++) {
            for (int k = 0; k < squareArray[j].length; k++) {
                if (index < array.length) {
                    squareArray[j][k] = array[index];
                    index++;
                } else {
                    squareArray[j][k] = 0;
                }
            }
        }
        return squareArray;
    }
}