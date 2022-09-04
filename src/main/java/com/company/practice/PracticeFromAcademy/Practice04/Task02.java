package com.company.practice.PracticeFromAcademy.Practice04;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.print("Введите четырёхзначное число: ");
        Scanner scanner = new Scanner(System.in);
        int integerNumber = scanner.nextInt();

        if (integerNumber == 0) {
            System.out.printf("Вы ввели %s.", integerNumber);
        } else {
            System.out.printf("Произведение чисел из введённого числа: %s", getMultiplicationDigits(integerNumber));
        }
        scanner.close();
    }

    private static int getMultiplicationDigits(int integerNumber) {
        if (integerNumber == 0) {
            return 1;
        }
        return (integerNumber % 10) * getMultiplicationDigits(integerNumber / 10);
    }
}
