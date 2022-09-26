package com.company.practice.PracticeFromAcademy.Practice07;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task04 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа:\n");
        System.out.print("Первое число: ");
        int inputFirstNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Второе число: ");
        int inputSecondNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Сумма чисел указанного диапазона: " + getSumOfRange(inputFirstNumber, inputSecondNumber) + "\n");
        System.out.print("Среднеарифметическое чисел указанного диапазона: " + getArithmeticMeanOfRange(inputFirstNumber, inputSecondNumber) + "\n");

        scanner.close();
    }

    private static int getSumOfRange(int inputFirstNumber, int inputSecondNumber) {
        return IntStream.rangeClosed(inputFirstNumber, inputSecondNumber).sum();
    }

    private static double getArithmeticMeanOfRange(int inputFirstNumber, int inputSecondNumber) {
        return (double) getSumOfRange(inputFirstNumber, inputSecondNumber) / (inputSecondNumber - inputFirstNumber + 1);
    }
}
