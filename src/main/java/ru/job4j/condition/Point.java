package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(2, 4, 5, 6);
        double result3 = Point.distance(1, 3, 2, 4);
        double result4 = Point.distance(-1, 0, -3, -1);
        System.out.println("result (0, 0) to (2, 0)" + result1);
        System.out.println("result (5, 2) to (6, 4)" + result2);
        System.out.println("result (2, 1) to (4, 3)" + result3);
        System.out.println("result (-3, -1) to (-1, 0)" + result4);
    }
}

