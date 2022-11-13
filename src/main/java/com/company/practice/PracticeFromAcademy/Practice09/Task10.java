package com.company.practice.PracticeFromAcademy.Practice09;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Введите размер массива. элементы массива заполнятся случайными числами.
                Размер массива:\s""");

        int arrayLength = Integer.parseInt(scanner.nextLine());
        long[] numberArray = fillArrayRandomNumbers(arrayLength);

//        printArrayElements(numberArray);
    }

    private static void printArrayElements(long[] numberArray) {
        for (int index = 0; index < numberArray.length; index++) {
            System.out.printf("Значение элемента массива с индексом [%d]: %d\n", index, numberArray[index]);
        }
    }

    private static long[] fillArrayRandomNumbers(int arrayLength) {
        Random random = new Random();
        long[] arrayTemp = new long[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            arrayTemp[index] = random.nextInt(101) - 50;
        }
        return arrayTemp;
    }
}
