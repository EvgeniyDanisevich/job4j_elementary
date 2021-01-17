package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        String result = "";
        if (words.length != 1) {
            for (int i = 0; i < words.length; i++) {
                if (i < words.length - 1) {
                    result = result + words[i] + " ";
                } else {
                    result = result + words[i];
                }
            }
        } else {
            result = words[0];
        }
        return result;
    }
}