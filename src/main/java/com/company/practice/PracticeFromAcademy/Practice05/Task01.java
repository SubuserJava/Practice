package com.company.practice.PracticeFromAcademy.Practice05;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out,true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputNumber = scanner.nextInt();

        if (getEvenOrOddNumber(inputNumber)) {
            System.out.printf("Число %s ", inputNumber + " является чётным.");
        } else {
            System.out.printf("Число %s ", inputNumber + " является нечётным.");
        }

        scanner.close();
    }

    private static boolean getEvenOrOddNumber(int inputNumber) {
        return inputNumber % 2 == 0;
    }
}
