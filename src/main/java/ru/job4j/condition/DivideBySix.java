package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        return (number % 3 == 0 && number % 2 == 0)
                ? "The number divides by 6."
                : (number % 3 == 0)
                ? "The number divides by 3, but it isn't the even number."
                : (number % 2 == 0)
                ? "The number doesn't divide by 3, but it is the even number."
                : "The number doesn't divide by 3 and it isn't the even number.";
    }
}

