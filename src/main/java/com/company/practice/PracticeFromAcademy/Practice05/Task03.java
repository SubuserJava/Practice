package com.company.practice.PracticeFromAcademy.Practice05;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task03 {

    private static final Long[] INPUT_NUMBERS = new Long[3];

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        fillArrayWithNumbers();

        switch (getChoiceFromMenu()) {
            case 1 -> System.out.printf("Максимум из трёх чисел: %s", (getMaxOfNumbers()));
            case 2 -> System.out.printf("Минимум из трёх чисел: %s", getMinOfNumbers());
            case 3 -> System.out.printf("Среднеарифметическое трёх чисел: %s", getArithmeticMeanOfNumbers());
        }
    }

    private static int getChoiceFromMenu() {
        Scanner input = new Scanner(System.in);

        System.out.print("Что вы хотите сделать с введёнными числами?\n");
        System.out.print("""
                1. Вывод максимума из трёх чисел.
                2. Вывод минимума из трёх чисел.
                3. Вывод среднеарифметическое из трёх чисел.
                Ваш выбор:
                """);
        int selectionNumber = parseInt(input.nextLine());

        input.close();
        return selectionNumber;
    }

    private static Long getMaxOfNumbers() {
        return Arrays.stream(INPUT_NUMBERS).max(Long::compare).get();
    }

    private static Long getMinOfNumbers() {
        return Arrays.stream(INPUT_NUMBERS).min(Long::compare).get();
    }

    private static Long getArithmeticMeanOfNumbers() {
        return Arrays.stream(INPUT_NUMBERS).reduce(0L, Long::sum) / INPUT_NUMBERS.length;
    }

    private static void fillArrayWithNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 3 числа. После ввода каждого числа нажимайте 'Enter': \n");
        for (int current = 0; current < INPUT_NUMBERS.length; current++) {
            INPUT_NUMBERS[current] = Long.parseLong(scanner.nextLine());
        }
    }
}
