package ru.job4j.array;

public class My {
    public static char proverka(char[][] array) {
        int cornerI = 0;
        int cornerJ = 0;
        char ch = 'o';
        if (array[cornerI][cornerJ] == 'O' && array[cornerI][cornerJ + 1] == 'O' && array[cornerI + 1][cornerJ] == 'O') {
            return array[cornerI][cornerJ];
        } else {
            for (int i = 0; i < array.length - 2; i++) {
                for (int j = 0; j < array[i].length - 2; j++) {
                    if (array[i][j] == array[i + 1][j] && array[i][j] == array[i + 2][j]) {
                        ch = array[i + 1][j];
                        break;
                    } else if (array[i][j] == array[i][j + 1] && array[i][j] == array[i][j + 2]) {
                        ch = array[i][j + 1];
                        break;
                    }
                }
            }
        }
        return ch;
    }
}
