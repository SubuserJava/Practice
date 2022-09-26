package com.company.practice.PracticeFromAcademy.Practice08;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадрата: ");
        int inputSquareSideSize = Integer.parseInt(scanner.nextLine());

        printSquare(inputSquareSideSize);

        scanner.close();
    }

    private static void printSquare(int squareSideSize) {
        for (int index = 1; index < squareSideSize; index++) {
            System.out.println("*".repeat(squareSideSize));

        }
    }
}
