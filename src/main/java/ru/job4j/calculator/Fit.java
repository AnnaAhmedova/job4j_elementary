package ru.job4j.calculator;

public class Fit {

    public static double manWeight(int manHeight) {

        return (manHeight - 100) * 1.15;
    }

    public static double womanWeight(int womanHeight) {

        return (womanHeight - 110) * 1.15;
    }

    public static void main(String[] args) {
        int manHeight = 180;
        int womanHeight = 170;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Man 180 cm is" + man);
        System.out.println("Woman 170 cm is" + woman);
    }
}
