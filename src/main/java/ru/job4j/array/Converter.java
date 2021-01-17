package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int check = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                check++;
            }
        }
        int value = (int) Math.ceil(Math.sqrt(check));
        int[][] squareArray = new int[value][value];

        int[] buffer = new int[check];
        int indexBuffer = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                buffer[indexBuffer] = array[i][j];
                indexBuffer++;
            }
        }
        indexBuffer = 0;
        for (int j = 0; j < squareArray.length; j++) {
            for (int k = 0; k < squareArray[j].length; k++) {
                if (indexBuffer < buffer.length) {
                    squareArray[j][k] = buffer[indexBuffer];
                    indexBuffer++;
                } else {
                    squareArray[j][k] = 0;
                }
            }
        }
        return squareArray;
    }
}