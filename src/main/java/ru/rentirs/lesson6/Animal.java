package ru.rentirs.lesson6;

public abstract class Animal {

    public static int animals = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        animals++;
    }

    public abstract String run(int distance);

    public abstract String swim(int distance);

}
