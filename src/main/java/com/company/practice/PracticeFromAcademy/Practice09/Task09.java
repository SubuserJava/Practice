package com.company.practice.PracticeFromAcademy.Practice09;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Task09 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Введите размер массива. элементы массива заполнятся случайными числами.
                Размер массива:\s""");

        int arrayLength = Integer.parseInt(scanner.nextLine());
        long[] numberArray = fillArrayRandomNumbers(arrayLength);

//        printArrayElements(numberArray);

        System.out.printf("Method 1. Сумма отрицательных чисел равна %d.\n", getSumNegativeNumberMethod1(numberArray));
        System.out.printf("Method 2. Сумма отрицательных чисел равна %d.\n", getSumNegativeNumberMethod2(numberArray));
        System.out.printf("Method 1. Сумма чётных чисел равна %d.\n", getSumEvenNumberMethod1(numberArray));
        System.out.printf("Method 2. Сумма чётных чисел равна %d.\n", getSumEvenNumberMethod2(numberArray));
        System.out.printf("Method 1. Сумма нечётных чисел равна %d.\n", getSumOddNumberMethod1(numberArray));
        System.out.printf("Method 2. Сумма нечётных чисел равна %d.\n", getSumOddNumberMethod2(numberArray));
        System.out.printf("Method 1. Произведение элементов с индексами кратными 3 равно %d.\n", getMultiplicationWithIndexMethod1(numberArray));
        System.out.printf("Method 2. Произведение элементов с индексами кратными 3 равно %d.\n", getMultiplicationWithIndexMethod2(numberArray));
        System.out.printf("Произведение элементов между min и max равно %d.\n", getMultiplicationBetweenMinMax(numberArray));
        System.out.printf("Сумма элементов, находящихся между первым и последним положительными элементами равна %d.",
                getSumBetweenFirstLastPositive(numberArray));

    }

    private static long getSumBetweenFirstLastPositive(long[] numberArray) {
        long sumBetweenFirstLastPositive = 0;
        int indexFirstPositive = 0;
        int indexLastPositive = 0;
        for (int index = 0; index < numberArray.length; index++) {
            if (numberArray[index] > 0) {
                indexFirstPositive = index;
                break;
            }
        }
        for (int index = numberArray.length - 1; index >= 0; index--) {
            if (numberArray[index] > 0) {
                indexLastPositive = index;
                break;
            }
        }
        for (int index = indexFirstPositive; index < indexLastPositive + 1; index++) {
            sumBetweenFirstLastPositive += numberArray[index];

        }
        return sumBetweenFirstLastPositive;
    }


    private static long getMultiplicationBetweenMinMax(long[] numberArray) {
        long multiplicationBetweenMinMax = 1;
        int indexOfMin = 0;
        int indexOfMax = 0;
        for (int index = 0; index < numberArray.length; index++) {
            if (numberArray[index] > numberArray[indexOfMax]) {
                indexOfMax = index;
            }
            if (numberArray[index] < numberArray[indexOfMin]) {
                indexOfMin = index;
            }
        }
        if (indexOfMin < indexOfMax) {
            for (int index = indexOfMin; index < indexOfMax + 1; index++) {
                multiplicationBetweenMinMax *= numberArray[index];
            }
        } else {
            for (int index = indexOfMax; index < indexOfMin + 1; index++) {
                multiplicationBetweenMinMax *= numberArray[index];
            }
        }

        return multiplicationBetweenMinMax;
    }

    private static long getMultiplicationWithIndexMethod2(long[] numberArray) {
        return LongStream.range(1, numberArray.length)
                .filter(index -> index % 3 == 0)
                .map(index -> numberArray[(int) index])
                .reduce((a1, a2) -> a1 * a2)
                .orElse(-1);
    }

    private static long getMultiplicationWithIndexMethod1(long[] numberArray) {
        long multiplicationElements = 1;
        for (int index = 1; index < numberArray.length; index++) {
            if (index % 3 == 0) multiplicationElements *= numberArray[index];
        }
        return multiplicationElements;
    }

    private static long getSumOddNumberMethod2(long[] numberArray) {
        return LongStream.of(numberArray).filter(i -> i % 2 != 0).sum();
    }

    private static long getSumOddNumberMethod1(long[] numberArray) {
        long sumOddNumbers = 0;
        for (long current : numberArray) {
            if (current % 2 != 0) sumOddNumbers += current;
        }
        return sumOddNumbers;
    }

    private static long getSumEvenNumberMethod2(long[] numberArray) {
        return LongStream.of(numberArray).filter(i -> i % 2 == 0).sum();
    }

    private static long getSumEvenNumberMethod1(long[] numberArray) {
        long sumEvenNumbers = 0;
        for (long current : numberArray) {
            if (current % 2 == 0) sumEvenNumbers += current;
        }
        return sumEvenNumbers;
    }

    private static long getSumNegativeNumberMethod2(long[] numberArray) {
        return LongStream.of(numberArray).filter(i -> i < 0).sum();
    }

    private static long getSumNegativeNumberMethod1(long[] numberArray) {
        long sumNegative = 0;
        for (long current : numberArray) {
            if (current < 0) sumNegative += current;
        }
        return sumNegative;
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
            arrayTemp[index] = random.nextInt(11) - 5;
        }
        return arrayTemp;
    }
}
