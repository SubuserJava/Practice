package com.company.practice.PracticeFromAcademy.Practice09;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Введите размер массива. Затем введите элементы массива.
                Можно закончить ввод элементов,введом пустой строки или любого(-ых) символа(-ов).

                Размер массива:\s""");

        int[] numberArray = new int[Integer.parseInt(scanner.nextLine())];

        for (int index = 0; index < numberArray.length; index++) {
            System.out.print("Элемент массива: ");
            String inputString = scanner.nextLine();
            if (inputString.isEmpty() || !inputString.matches("[-+]?\\d+")) break;
            numberArray[index] = Integer.parseInt(inputString);
        }

        System.out.printf("Method 1. Сумма элементов массива: %d\n\n", getSumArrayMethod1(numberArray));
        System.out.printf("Method 2. Сумма элементов массива: %d\n\n", getSumArrayMethod2(numberArray));
        System.out.printf("Method 1. Среднеарифметическое элементов массива: %f\n\n", getArithmeticMeanArray(numberArray));
        printArrayElements(numberArray);

        scanner.close();
    }

    private static void printArrayElements(int[] numberArray) {
        for (int index = 0; index < numberArray.length; index++) {
            System.out.printf("Значение элемента массива с индексом [%d]: %d\n", index, numberArray[index]);
        }
    }

    private static double getArithmeticMeanArray(int[] numberArray) {
        return (double) getSumArrayMethod1(numberArray) / numberArray.length;
    }

    private static int getSumArrayMethod1(int[] numberArray) {
        int sumNumbers = 0;
        for (int current : numberArray) {
            sumNumbers += current;
        }
        return sumNumbers;
    }

    private static int getSumArrayMethod2(int[] numberArray) {
        return Arrays.stream(numberArray).sum();
    }
}
