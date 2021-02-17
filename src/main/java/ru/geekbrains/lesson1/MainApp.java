package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        byte varByte = 120;
        short varShort = 1200;
        int varInt = 120_000;
        long varLong = 2020L;
        float varFloat = 1.2f;
        double varDouble = 2002.8;
        char varChar = 'a';
        boolean varBoolean = false;
        System.out.println(function(1, 3, 4, 2));
        System.out.println(interval(-2, 12));
        positiveOrNegativ(-1);
        System.out.println(positiveFalse(5));
        helloName("Ренат");
        leapYear(1984);
    }

    public static float function(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean interval(int num1, int num2) {
        return (num1 + num2 >= 10 && num1 + num2 <= 20);
    }

    public static void positiveOrNegativ(int num) {
        if (num < 0) {
            System.out.println("Число отрицательное.");
        }
        else {
            System.out.println("Число положительное.");
        }
    }

    public static boolean positiveFalse(int num) {
        return (num < 0);
    }

    public static void helloName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYear(int year) {
        if (year%4 == 0 && year%100!=0 || year%400 == 0) {
            System.out.println(year + " год високосный.");
        }
        else {
            System.out.println(year + " год не високосный.");
        }
    }
}
