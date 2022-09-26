package com.company.practice.PracticeFromAcademy.Practice07;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину линии: ");
        int inputNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите символ для создания вертикальной линии: ");
        char inputChar = scanner.nextLine().charAt(0);

        printLine(inputNumber, inputChar);
        scanner.close();
    }

    private static void printLine(int inputNumber, char inputChar) {
        for (int index = 0; index < inputNumber; index++) {
            System.out.println(inputChar);
        }
    }
}
