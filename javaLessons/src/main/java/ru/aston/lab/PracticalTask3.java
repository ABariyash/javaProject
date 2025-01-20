package ru.aston.lab;

public class PracticalTask3 {

    public static void main(String[] args) {

        System.out.println(isSumInRange(10, 5));

        printNumberSign(-10);

        System.out.println(isNegativeNumber(-5));

        printStringNTimes("Hello", 3);

        System.out.println(isLeapYear(2025));

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeArray(array);
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        int[] filledArray = fillArray();
        for (int value : filledArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyValuesLessThanSix(numbers);
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();

        int[][] matrix = new int[5][5];
        fillDiagonals(matrix);
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        int[] customArray = createArray(5, 42);
        for (int value : customArray) {
            System.out.print(value + " ");
        }
    }


    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegativeNumber(int number) {
        return number < 0;
    }

    public static void printStringNTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
    }

    public static int[] fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void multiplyValuesLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    public static int[][] fillDiagonals(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        return arr;
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

}
