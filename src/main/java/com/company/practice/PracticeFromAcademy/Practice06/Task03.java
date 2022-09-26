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

        System.out.printf("%s-й месяц соответствует декаде: '%s'.\n", inputMonthNumber, getDecadeOfYear(inputMonthNumber));
        System.out.printf("Название %s-ого месяца: %s.\n", inputMonthNumber, getNameOfMonth(inputMonthNumber));

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

    private  static String getNameOfMonth(int monthNumber) {
        switch (monthNumber) {
            case 1 -> { return "Январь."; }
            case 2 -> { return "Февраль."; }
            case 3 -> { return "Март."; }
            case 4 -> { return "Апрель."; }
            case 5 -> { return "Май."; }
            case 6 -> { return "Июнь."; }
            case 7 -> { return "Июль."; }
            case 8 -> { return "Август."; }
            case 9 -> { return "Сентябрь."; }
            case 10 -> { return "Октябрь."; }
            case 11 -> { return "Ноябрь."; }
            case 12 -> { return "Декабрь."; }
            default -> { return "Номер месяца не соответствует..."; }
        }
    }
}
