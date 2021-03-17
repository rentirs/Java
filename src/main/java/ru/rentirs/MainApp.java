package ru.rentirs;

import java.util.Scanner;

public class MainApp {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Кеша", 5, false);
        cats[1] = new Cat("Тишка", 30, false);
        cats[2] = new Cat("Мурзик", 10, false);
        cats[3] = new Cat("Барсик", 45, false);


        Plate plate = new Plate(50);
        plate.info();
        for (Cat cat : cats) {
            if (!cat.fullness && cat.appetite < plate.food) {
                cat.eat(plate);
                cat.fullness = true;
                System.out.println("Кот " + cat.name + " поел!");
            } else {
                System.out.println("Кот " + cat.name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько еды добавить еще в миску?");
        action = scanner.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}
