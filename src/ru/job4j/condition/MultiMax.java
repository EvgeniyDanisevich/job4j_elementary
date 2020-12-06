package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second) {
            if (first > third) {
                result = first;
            } else {
                result = third;
            }
        } else if (second > third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(2, 1, 3));
    }
}
