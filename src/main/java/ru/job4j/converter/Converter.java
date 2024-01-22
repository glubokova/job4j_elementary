package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float input = 120;
        float expected = 2;
        float output = Converter.rubleToDollar(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result: " + passed);
    }
}