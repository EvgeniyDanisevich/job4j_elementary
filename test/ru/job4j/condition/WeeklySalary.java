package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int moneyDay;
        int moneyWeek = 0;
        for (int i = 0; i < hours.length - 2; i++) {
            if (hours[i] < 8) {
                moneyDay = hours[i] * 10;
            } else {
                moneyDay = (hours[i] - 8) * 5 + hours[i] * 10;
            }
            moneyWeek += moneyDay;
        }
        for (int i = hours.length - 2; i < hours.length; i++) {
            if (hours[i] < 8) {
                moneyDay = hours[i] * 10;
            } else {
                moneyDay = (hours[i] - 8) * 5 + hours[i] * 10;
            }
            moneyWeek += (moneyDay * 2);
        }
        return moneyWeek;
    }

    public static void main(String[] args) {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        System.out.println(calculate(hours));
    }
}