package com.company.practice.PracticeFromAcademy.Practice04;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//Пользователь вводит с клавиатуры три цифры. Необ-
//ходимо создать число, содержащее эти цифры. Например,
//если с клавиатуры введено 7, 3, 8, тогда нужно сформи-
//ровать число 738.
public class Task01 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.print("Вводите цифры.\nПосле ввода каждой цифры нажимайте 'Enter'.\nПосле окончания ввода наберите 'exit'.\nВвод цифр:\n");

        System.out.printf("Ваше сформированное число: %s", Integer.parseInt(String.valueOf(getNumberFromInputDigits())));
    }

    private static StringBuilder getNumberFromInputDigits() {
        StringBuilder numberFromString = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String string;

        do {
            string = scanner.nextLine();
            if (string.equals("exit")) {
                break;
            }
            numberFromString.append(string);
        } while (scanner.hasNextLine());
        scanner.close();
        return numberFromString;
    }
}
