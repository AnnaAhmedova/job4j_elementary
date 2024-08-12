package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short mheight) {
        return (mheight - 100) * 1.15;
    }

    public static double womanWeight(short wheight) {
        return (wheight - 110) * 1.15;
    }

    public static void main(String[] args) {
        short mheight = 187;
        short wheight = 162;
        double man = Fit.manWeight(mheight);
        double woman = Fit.womanWeight(wheight);
        System.out.println("Man 187 is" + man);
        System.out.println("Woman 162 is" + woman);
    }
}
