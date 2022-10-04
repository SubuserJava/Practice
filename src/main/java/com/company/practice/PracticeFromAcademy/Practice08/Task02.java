package com.company.practice.PracticeFromAcademy.Practice08;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадрата: ");
        int inputSquareSideSize = Integer.parseInt(scanner.nextLine());

        printEmptySquare(inputSquareSideSize);

        scanner.close();
    }

    private static void printEmptySquare(int squareSideSize) {
        System.out.println("*".repeat(squareSideSize));

        for (int index = 1; index <= squareSideSize - 2; index++) {
            System.out.print("*");
            System.out.print(" ".repeat(squareSideSize - 2));
            System.out.print("*\n");
        }

        System.out.println("*".repeat(squareSideSize));
    }
}
