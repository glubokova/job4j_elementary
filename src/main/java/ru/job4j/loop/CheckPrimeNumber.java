package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 17;
        if (check(num)) {
            System.out.println(num + " является простым числом");
        } else {
            System.out.println(num + " не является простым числом");
        }
    }
}