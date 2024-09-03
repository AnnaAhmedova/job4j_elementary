package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int result1 = Max.max(1, 2);
        System.out.println(result1);
        int result2 = Max.max(2, 1);
        System.out.println(result2);
        int result3 = Max.max(2, 2);
        System.out.println(result3);
    }
}
