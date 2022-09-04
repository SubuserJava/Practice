package com.company.practice.PracticeFromAcademy.Practice04;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task05 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int integerNumber = scanner.nextInt();

        System.out.printf("Перевёрнутое число: %s", getReverseNumber(integerNumber));

        scanner.close();
    }

    private static int getReverseNumber(int integerNumber) {
        int reversed = 0;
        if (integerNumber < 10) {
            return integerNumber;
        } else {
            for (; integerNumber != 0; integerNumber /= 10) {
                int digit = integerNumber % 10;
                reversed = reversed * 10 + digit;
            }
        }
        return reversed;
    }
}
