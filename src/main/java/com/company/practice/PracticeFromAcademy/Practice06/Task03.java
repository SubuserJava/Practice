package com.company.practice.PracticeFromAcademy.Practice06;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int inputMonthNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("%s-й месяц соответствует декаде '%s'", inputMonthNumber, getDecadeOfYear(inputMonthNumber));

        scanner.close();
    }

    private static String getDecadeOfYear(int monthNumber) {
        if (monthNumber > 12) {
            return "Число месяца больше 12.";
        } else {
            return monthNumber <= 2 ? "Winter" : monthNumber <= 5 ? "Spring" : monthNumber <= 8 ? "Summer" :
                    monthNumber <= 11 ? "Autumn" : "Winter";
        }
    }
}
