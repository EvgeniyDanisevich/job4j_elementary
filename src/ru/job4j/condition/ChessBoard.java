package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            return Math.abs(x2 - x1);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(way(5, 7, 3, 5));
    }
}
