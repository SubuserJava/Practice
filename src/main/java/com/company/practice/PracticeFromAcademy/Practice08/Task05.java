package com.company.practice.PracticeFromAcademy.Practice08;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите диапазон чисел для вывода результатов таблицы умножения для диапазона чисел.\n");
        System.out.print("Начало диапазона: ");
        int inputStartRange = Integer.parseInt(scanner.nextLine());
        System.out.print("Конец диапазона: ");
        int inputEndRange = Integer.parseInt(scanner.nextLine());
        System.out.printf("\nПечать таблиц умножения в диапазоне %s до %s:\n", inputStartRange, inputEndRange);

        printMultiplicationTable(inputStartRange, inputEndRange);

        scanner.close();
    }

    private static void printMultiplicationTable(int inputStartRange, int inputEndRange) {
        for (int factor1 = inputStartRange; factor1 <= inputEndRange; factor1++) {
            System.out.printf("\nТаблица умножения числа %s:\n", factor1);
            for (int factor2 = 1; factor2 <= 10; factor2++) {
                System.out.printf("%s * %s = %s\n", factor1, factor2, factor1 * factor2);
            }
        }
    }
}
