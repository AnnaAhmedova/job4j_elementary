package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
    }

    public static void main(String[] args) {
        boolean result1 = Triangle.exist(2, 2, 2);
        boolean result2 = Triangle.exist(6, 4, 1);
        System.out.println(result1);
        System.out.println(result2);
    }
}