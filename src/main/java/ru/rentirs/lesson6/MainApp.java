package ru.rentirs.lesson6;

public class MainApp {

    public static void main(String[] agrs) {

        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");

        System.out.println(catMurzik.run(200));
        System.out.println(catMurzik.swim(10));

        System.out.println(dogBobik.run(500));
        System.out.println(dogBobik.swim(10));

        System.out.println("Количество созданных животных: " + Animal.animals);
        System.out.println("Количество созданных котов: " + Cat.cats);
        System.out.println("Количество созданных собак: " + Dog.dogs);
    }
}
