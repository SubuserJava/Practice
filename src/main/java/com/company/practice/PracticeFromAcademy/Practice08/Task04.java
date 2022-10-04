package com.company.practice.PracticeFromAcademy.Practice08;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите диапазон чисел.\n");
        System.out.print("Начало диапазона: ");
        int inputStartRange = Integer.parseInt(scanner.nextLine());
        System.out.print("Конец диапазона: ");
        int inputEndRange = Integer.parseInt(scanner.nextLine());
        System.out.printf("\nПростые числа в указанном диапазоне от %s до %s:\n", inputStartRange, inputEndRange);

        System.out.println(getPrimeNumbers(inputStartRange, inputEndRange));

        scanner.close();
    }

    private static String getPrimeNumbers(int inputStartRange, int inputEndRange) {

        StringBuilder primeNumbers = new StringBuilder();
        for (int index = inputStartRange; index <= inputEndRange; index++) {
            if (index % 2 > 0) {
                primeNumbers.append(index).append(" ");
            }
        }
        return primeNumbers.toString();
    }
}
