package ru.job4j.ru.job4j.calculator;

public class Fit {

    public static double manWeight(short ignoredHeight) {
        return 187 - 100 * 1.15;
    }

    public static double womanWeight(short ignoredHeight) {
        return 187 - 110 * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
