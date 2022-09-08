package com.company.practice.PracticeFromAcademy.Practice05;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task02 {

    private static final Long[] INPUT_NUMBERS = new Long[3];

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 3 числа. После ввода каждого числа нажимайте 'Enter': \n");
        for (int current = 0; current < INPUT_NUMBERS.length; current++) {
            INPUT_NUMBERS[current] = Long.parseLong(scanner.nextLine());
        }

        switch (getChoiceFromMenu()) {
            case 1 -> System.out.printf("Сумма введённых чисел: %s", getSumOfNumbers());
            case 2 -> System.out.printf("Произведение чисел: %s", getMultiplicationOfNumbers());
        }
        scanner.close();
    }

    private static int getChoiceFromMenu() {
        Scanner input = new Scanner(System.in);
        System.out.print("Что вы хотите сделать с введёнными числами?\n");
        System.out.print("""
                1. Сложить.
                2. Перемножить.
                Ваш выбор:
                """);
        int selectionNumber = parseInt(input.nextLine());
        input.close();
        return selectionNumber;
    }

    private static Long getSumOfNumbers() {
        return INPUT_NUMBERS[0] + INPUT_NUMBERS[1] + INPUT_NUMBERS[2];
    }

    private static Long getMultiplicationOfNumbers() {
        return INPUT_NUMBERS[0] * INPUT_NUMBERS[1] * INPUT_NUMBERS[2];
    }
}
