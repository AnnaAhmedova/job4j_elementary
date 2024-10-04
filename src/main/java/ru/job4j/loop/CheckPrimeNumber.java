package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number1) {
        boolean prime = number1 > 1;
        for (int index = 2; index <= number1 / 2; index++) {
            if (number1 % index == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
