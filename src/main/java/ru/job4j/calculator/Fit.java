package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short manHeight) {

        return (manHeight - 100) * 1.15;
    }

    public static double womanWeight(short womanHeight) {

        return (womanHeight - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 180;
        short womanHeight = 170;
        double man = Fit.manWeight(manHeight);
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Man 180 is" + man);
        System.out.println("Woman 170 is" + woman);
    }
}
