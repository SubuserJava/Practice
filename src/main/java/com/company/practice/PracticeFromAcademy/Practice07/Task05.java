package com.company.practice.PracticeFromAcademy.Practice07;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для расчёта факториала:\n");
        System.out.print("Число: ");
        long inputNumber = Long.parseLong(scanner.nextLine());

        System.out.printf("Факториал числа %s = %s", inputNumber, getFactorialOfNumber(inputNumber) + ".\n");

        scanner.close();
    }

    private static long getFactorialOfNumber(long inputNumber) {
        return inputNumber == 1 ? 1 : (inputNumber * getFactorialOfNumber(inputNumber - 1));
    }
}
