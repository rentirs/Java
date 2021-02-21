package ru.rentirs.lesson2;

public class MainApp {
    public static void main(String[] args) {
        invertArray(); 
        fillArray();
        changeArray();
        fillDiagonal();
        minMax();
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr));
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        offsetArr(arr2, -15);
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            /* Вариант в несколько строк
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }*/
            arr[i] = (arr[i] - 1) * -1; // Вариант в одну строку
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println();
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[arr.length - i - 1][i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void minMax() {
        int[] arr = {5, -25, 23, 57, -28, 2021, -2021};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    // В группе писали, что уложились в 8 строк, у меня, к сожалению, 15
    public static boolean checkBalance(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int sumLeft = 0, sumRight = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                sumLeft += arr[j];
            }
            for (int k = arr.length - i - 1; k < arr.length; k++) {
                sumRight += arr[k];
            }
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }

    //Очень тяжелое задание для новичка. Скорее всего решил не оптимально
    public static void offsetArr(int[] arr, int n) {
        if (n < 0) {
            n = (n - arr.length * (n / arr.length) + arr.length);
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

}


