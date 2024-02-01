package ru.job4j.loop;

import ru.job4j.condition.SwitchWeek;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int index = 1; index <= number; index++) {
            result = result * index;
        }
        return result;
    }
}
