package org.example;

public class Lesson_3 {
        static void print () {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        static void checkSumSing () {
            int a = 10;
            int b = -5;
            int sum = a + b;
            if (sum >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

        public static void printColor () {
            int value = 36;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }

        public static void compareNumbers () {
            int a = 13;
            int b = 7;
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }

        public static boolean isSumInRange ( int a, int b){
            int sum = a + b;
            return sum >= 10 && sum <= 20;
        }

        public static void checkNumber ( int number){
            if (number >= 0) {
                System.out.println("Число " + number + " является положительным.");
            } else {
                System.out.println("Число " + number + " является отрицательным.");
            }
        }

        public static void isPositive ( int number){
            System.out.println((number >= 0) ? "true" : "false");
        }

        public static void printString (String str,int number){
            for (int i = 0; i < number; i = i + 1) {
                System.out.println(str);
            }
            System.out.println();
        }


    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

        public static void printArray ( int[] array){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = 1;
                } else {
                    array[i] = 0;
                }
            }
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


        public static void nullArray ( int[] array){
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

        }

        public static void numberArray ( int[] array){
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                    array[i] *= 2;
                }
            }
            for (int num : array) {
                System.out.println(num + " ");
            }
        }
    }
