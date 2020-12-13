package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
        }
        int a = 1;
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = a;
                a++;
            }
        }
        // your code here
        return triangle;
    }
}