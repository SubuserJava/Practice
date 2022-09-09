package com.company.practice.PracticeFromAcademy.Practice06;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите шестизначное число: ");
        String inputNumber = scanner.nextLine();

        if (inputNumber.matches("[0-9]{6}")) {
            char[] charsArray = inputNumber.toCharArray();
            System.out.print(isHappyNumber(charsArray) ? "Число счастливое!\n" : "Число не счастливое!\n");
        } else {
            System.out.print("Вы ввели не шестизначное число или число с символами.\n");
        }
        scanner.close();
    }

    private static boolean isHappyNumber(char[] charsArray) {
        return charsArray[0] + charsArray[1] + charsArray[2] == charsArray[3] + charsArray[4] + charsArray[5];
    }
}
