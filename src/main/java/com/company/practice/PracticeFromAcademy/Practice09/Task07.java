package com.company.practice.PracticeFromAcademy.Practice09;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Введите размер массива. Затем введите элементы массива.
                Можно закончить ввод элементов,введом пустой строки или любого(-ых) символа(-ов).
                Затем введите некоторое число для проверки.

                Размер массива:\s""");

        int[] numberArray = new int[Integer.parseInt(scanner.nextLine())];

        for (int index = 0; index < numberArray.length; index++) {
            System.out.print("Элемент массива: ");
            String inputString = scanner.nextLine();
            if (inputString.isEmpty() || !inputString.matches("[-+]?\\d+")) break;
            numberArray[index] = Integer.parseInt(inputString);
        }
        System.out.print("Число для проверки: ");
        int numberForCheck = Integer.parseInt(scanner.nextLine());

        System.out.printf("Method 1. Число %d встречается в массиве %d раз(-а).\n",numberForCheck, getCheckMatchingNumberInArrayMethod1(numberArray,
                numberForCheck));
        System.out.printf("Method 2. Число %d встречается в массиве %d раз(-а).\n",numberForCheck, getCheckMatchingNumberInArrayMethod2(numberArray,
                numberForCheck));

        scanner.close();
    }

    private static long getCheckMatchingNumberInArrayMethod2(int[] numberArray, int numberForCheck) {
        return Arrays.stream(numberArray).filter(i -> i == numberForCheck).count();
    }

    private static int getCheckMatchingNumberInArrayMethod1(int[] numberArray, int numberForCheck) {
        int matchingCount = 0;
        for (int current : numberArray) {
            if (current == numberForCheck) matchingCount++;
        }
        return matchingCount;
    }
}
