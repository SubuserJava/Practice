package com.company.practice.PracticeFromAcademy.Practice05;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во часов до 24-х: ");
        int inputHours = Integer.parseInt(scanner.nextLine());

        System.out.println(getTimeRange(inputHours));
        scanner.close();
    }

    private static String getTimeRange(int inputHours) {
        return inputHours >= 0 & inputHours < 6 ? "Good Night!" :
                inputHours >= 6 & inputHours < 13 ? "Good Morning!" :
                inputHours >= 13 & inputHours < 17 ? "Good Day!" :
                inputHours >= 17 & inputHours <= 24 ? "Good Evening!" : "This is not time format!";
    }
}
