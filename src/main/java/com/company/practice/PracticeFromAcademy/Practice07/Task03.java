package com.company.practice.PracticeFromAcademy.Practice07;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа:\n");
        System.out.print("Первое число: ");
        int inputFirstNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Второе число: ");
        int inputSecondNumber = Integer.parseInt(scanner.nextLine());

        printOddNumbersInRange(inputFirstNumber, inputSecondNumber);

        scanner.close();
    }

    private static void printOddNumbersInRange(int inputFirstNumber, int inputSecondNumber) {
        System.out.print("Нечётные числа из указанного диапазона: ");

        if (inputFirstNumber > inputSecondNumber) {
            int tempNumber = inputFirstNumber;
            inputFirstNumber = inputSecondNumber;
            inputSecondNumber = tempNumber;
        }

        while (inputFirstNumber <= inputSecondNumber) {
            System.out.print((inputFirstNumber % 2) != 0 ? inputFirstNumber + " " : " ");
            inputFirstNumber++;
        }
    }
}
