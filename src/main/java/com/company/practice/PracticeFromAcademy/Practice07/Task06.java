package com.company.practice.PracticeFromAcademy.Practice07;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину линии: ");
        int inputNumber = Integer.parseInt(scanner.nextLine());

        printLine(inputNumber);
        scanner.close();
    }

    private static void printLine(int inputNumber) {
        for (int index = 0; index < inputNumber; index++) {
            System.out.print("*");
        }
    }
}
