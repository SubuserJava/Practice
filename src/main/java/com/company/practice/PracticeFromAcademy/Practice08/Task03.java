package com.company.practice.PracticeFromAcademy.Practice08;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размеры прямоугольника.\n");
        System.out.print("Длина: ");
        int inputRectangleLength = Integer.parseInt(scanner.nextLine());
        System.out.print("Ширина: ");
        int inputRectangleWidth = Integer.parseInt(scanner.nextLine());
        System.out.println("\nПечать границ прямоугольника.\n");
        printRectangleBorders(inputRectangleLength, inputRectangleWidth);

        scanner.close();
    }

    private static void printRectangleBorders(int inputRectangleLength, int inputRectangleWidth) {
        System.out.println("*".repeat(inputRectangleLength));

        for (int index = 1; index <= inputRectangleWidth - 2; index++) {
            System.out.print("*");
            System.out.print(" ".repeat(inputRectangleLength - 2));
            System.out.print("*\n");
        }

        System.out.println("*".repeat(inputRectangleLength));
    }
}
