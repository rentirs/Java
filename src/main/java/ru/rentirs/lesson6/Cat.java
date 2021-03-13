package ru.rentirs.lesson6;

public class Cat extends Animal {

    public static int cats = 0;
    public static final int MAX_CAT_RUN_DIST = 200;

    public Cat(String name) {
        super(name);
        cats++;
    }

    public String run(int distance) {
        if (distance > MAX_CAT_RUN_DIST) {
            return "Кошка не может пробежать больше " + MAX_CAT_RUN_DIST + "м.";
        }
        return name + " пробежал " + distance + "м.";
    }

    public String swim(int distance) {
        return name + " не умеет плавать.";
    }
}
