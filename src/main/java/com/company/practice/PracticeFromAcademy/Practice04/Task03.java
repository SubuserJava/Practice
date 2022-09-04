package com.company.practice.PracticeFromAcademy.Practice04;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//сантиметры, дециметры, миллиметры, мили.
public class Task03 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.print("Введите расстояние в метрах: ");
        Scanner scanner = new Scanner(System.in);
        int inputMeters = scanner.nextInt();

        System.out.printf("Введённое расстояние в сантиметрах: %s\n", getConvertToCentimeters(inputMeters));
        System.out.printf("Введённое расстояние в дециметрах: %s\n", getConvertToDecimeters(inputMeters));
        System.out.printf("Введённое расстояние в миллиметрах: %s\n", getConvertToMillimeters(inputMeters));
        System.out.printf("Введённое расстояние в милях: %s\n", getConvertToMiles(inputMeters));

        scanner.close();
    }

    private static long getConvertToCentimeters(int inputMeters) {
        return inputMeters * 100L;
    }

    private static long getConvertToDecimeters(int inputMeters) {
        return inputMeters * 10L;
    }

    private static long getConvertToMillimeters(int inputMeters) {
        return inputMeters * 1000L;
    }

    private static double getConvertToMiles(int inputMeters) {
        return inputMeters * 0.000621371;
    }
}
