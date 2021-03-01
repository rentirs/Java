package ru.rentirs.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainApp {


    public static void main(String[] args) {
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nВыберите игру: 1 - Угадай число / 2 - Угадай слово / 0 - выход");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    guessNumber();
                    break;
                case 2:
                    guessWorld();
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }

    public static void guessNumber() {
        int answer = 1;
        Scanner scanner = new Scanner(System.in);
        while (answer == 1) {
            mainGame();
            System.out.print("Повторить игру еще раз? 1 – да / 0 – нет: ");
            answer = scanner.nextInt();
        }

    }

    public static void mainGame() {
        System.out.println("\n**********Угадай число**********\n");
        System.out.println("Угадайте число от 0 до 9. У Вас 3 попытки.");
        int numberOfAttempts = 1;
        int[] arrayUsedNumbers = new int[10];
        Random random = new Random();
        int hiddenNumber = random.nextInt(9);
        while (numberOfAttempts < 4) {
            System.out.print("Попытка №" + numberOfAttempts + ": ");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            while (arrayUsedNumbers[userNumber] == 1) {
                System.out.print("Вы уже вводили это число введите другое: ");
                userNumber = scanner.nextInt();
            }
            arrayUsedNumbers[userNumber] = 1;
            numberOfAttempts++;
            if (userNumber == hiddenNumber) {
                System.out.println("Вы угадали число!\n");
                break;
            } else if (userNumber > hiddenNumber) {
                System.out.println("Вы не угадали число. Ваше число больше загаданного.\n");
            } else {
                System.out.println("Вы не угадали число. Ваше число меньше загаданного.\n");
            }
        }
        System.out.println("Игра окончена. Загаданное число - " + hiddenNumber);
    }

    public static void guessWorld() {
        System.out.println("\n**********Угадай слово**********\n");
        String[] words = vocabulary();
        char[] hiddenWord = new char[15];
        Arrays.fill(hiddenWord, '#');
        Random random = new Random();
        String word = words[random.nextInt(words.length - 1)];
        String userWord;
        char[] arrayWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            arrayWord[i] = word.charAt(i);
        }
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово(овощ или фрукт):");
            userWord = scanner.next();

            for (int i = 0; i < arrayWord.length && i < userWord.length(); i++) {
                if (arrayWord[i] == userWord.charAt(i)) {
                    hiddenWord[i] = arrayWord[i];
                }
            }
            System.out.println(hiddenWord);
        } while (!userWord.equals(word));
        System.out.println("Вы угадали слово! Это слово - " + word);
    }

    public static String[] vocabulary() {
        return new String[] {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
    }
}




