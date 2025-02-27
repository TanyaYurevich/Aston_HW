package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lesson_3 lesson_3 = new Lesson_3();
        lesson_3.print ();
        Lesson_3 lesson_3_1 = new Lesson_3();
        lesson_3.checkSumSing();
        Lesson_3 lesson_3_2 = new Lesson_3();
        Lesson_3.printColor();
        Lesson_3 lesson_3_3 = new Lesson_3();
        Lesson_3.compareNumbers();
        Lesson_3 lesson_3_4 = new Lesson_3();
        System.out.println(lesson_3.isSumInRange(7, 9));
        lesson_3.checkNumber(9);
        Lesson_3 lesson_3_5 = new Lesson_3();
        Lesson_3.isPositive(-2);
        Lesson_3 lesson_3_6 = new Lesson_3();
        Lesson_3.printString("Hello", 4);
        Lesson_3 lesson_3_7 = new Lesson_3();
        System.out.println((Lesson_3.isLeapYear(2019) ? "true" : "false"));
        Lesson_3 lesson_3_8 = new Lesson_3();
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 1};
        Lesson_3.printArray(array);
        Lesson_3 lesson_3_9 = new Lesson_3();
        int[] array1 = new int[100];
        Lesson_3.nullArray(array1);
        Lesson_3 lesson_3_10 = new Lesson_3();
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Lesson_3.numberArray(array2);
    }
}