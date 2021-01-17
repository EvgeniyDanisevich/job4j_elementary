package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        String string = new String();
        char[] chName = fio[1].toCharArray();
        char[] chSurname = fio[2].toCharArray();
        string = fio[0] + " " + chName[0] + "." + chSurname[0] + ".";
        return string;
    }
}