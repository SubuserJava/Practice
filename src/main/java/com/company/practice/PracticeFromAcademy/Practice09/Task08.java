package com.company.practice.PracticeFromAcademy.Practice09;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Task08 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Введите размер массива. элементы массива заполнятся случайными числами.
                Размер массива:\s""");

        int arrayLength = Integer.parseInt(scanner.nextLine());
        long[] numberArray = fillArrayRandomNumbers(arrayLength);

        System.out.printf("Method 1. Максимальное значение в массиве: %d.\n", getMaxValueFromArrayMethod1(numberArray));
        System.out.printf("Method 2. Максимальное значение в массиве: %d.\n", getMaxValueFromArrayMethod2(numberArray).orElse(-1));
        System.out.printf("Method 1. Минимальное значение в массиве: %d.\n", getMinValueFromArrayMethod1(numberArray));
        System.out.printf("Method 2. Минимальное значение в массиве: %d.\n", getMinValueFromArrayMethod2(numberArray).orElse(-1));
        System.out.printf("Method 1. Количество отрицательных элементов: %d\n", getCountNegativeElementsMethod1(numberArray));
        System.out.printf("Method 2. Количество отрицательных элементов: %d\n", getCountNegativeElementsMethod2(numberArray));
        System.out.printf("Method 1. Количество положительных элементов: %d\n", getCountPositiveElementsMethod1(numberArray));
        System.out.printf("Method 2. Количество положительных элементов: %d\n", getCountPositiveElementsMethod2(numberArray));
        System.out.printf("Method 1. Количество нулей: %d\n", getCountZerosMethod1(numberArray));
        System.out.printf("Method 2. Количество нулей: %d\n", getCountZerosMethod2(numberArray));

        scanner.close();
    }

    private static long[] fillArrayRandomNumbers(int arrayLength) {
        Random random = new Random();
        long[] arrayTemp = new long[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            arrayTemp[index] = random.nextInt(100001) - 50000;
        }
        return arrayTemp;
    }

    private static long getCountZerosMethod2(long[] numberArray) {
        return LongStream.of(numberArray).filter(i -> i == 0).count();
    }

    private static int getCountZerosMethod1(long[] numberArray) {
        int countZeros = 0;
        for (long current : numberArray) {
            if (current == 0) countZeros++;
        }
        return countZeros;
    }

    private static long getCountPositiveElementsMethod2(long[] numberArray) {
        return numberArray.length - getCountNegativeElementsMethod2(numberArray);
    }

    private static int getCountPositiveElementsMethod1(long[] numberArray) {
        return numberArray.length - getCountNegativeElementsMethod1(numberArray);
    }

    private static long getCountNegativeElementsMethod2(long[] numberArray) {
        return LongStream.of(numberArray).filter(i -> i < 0).count();
    }

    private static int getCountNegativeElementsMethod1(long[] numberArray) {
        int countNegative = 0;
        for (long current : numberArray) {
            if (current < 0) countNegative++;
        }
        return countNegative;
    }

    private static OptionalLong getMinValueFromArrayMethod2(long[] numberArray) {
        return LongStream.of(numberArray).min();
    }

    private static long getMinValueFromArrayMethod1(long[] numberArray) {
        Arrays.sort(numberArray);
        return numberArray[0];
    }

    private static OptionalLong getMaxValueFromArrayMethod2(long[] numberArray) {
        return LongStream.of(numberArray).max();
    }

    private static long getMaxValueFromArrayMethod1(long[] numberArray) {
        Arrays.sort(numberArray);
        return numberArray[numberArray.length - 1];
    }
}
