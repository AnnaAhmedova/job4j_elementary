package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int operation1 = x2 - x1;
        int operation2 = y2 - y1;
        return Math.sqrt(Math.pow(operation1, 2) + Math.pow(operation2, 2));
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(2, 4, 5, 6);
        System.out.println("result (0, 0) to (2, 0)" + result1);
        System.out.println("result (5, 2) to (6, 4)" + result2);
    }
}

