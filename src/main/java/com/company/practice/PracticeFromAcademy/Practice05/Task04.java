package com.company.practice.PracticeFromAcademy.Practice05;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task04 {

    private static final double METERS_IN_MILE = 1609.3435021075907d;
    private static final double METERS_IN_INCH = 0.0254d;
    private static final double METERS_IN_YARD = 0.9144d;

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число метров: ");
        double inputMeters = Double.parseDouble(scanner.nextLine());

        switch (getChoiceFromMenu()) {
            case 1 -> System.out.printf("Число %s в милях: %s", inputMeters, inputMeters / METERS_IN_MILE);
            case 2 -> System.out.printf("Число %s в дюймах: %s", inputMeters, inputMeters / METERS_IN_INCH);
            case 3 -> System.out.printf("Число %s в ярдах: %s", inputMeters, inputMeters / METERS_IN_YARD);
        }
        scanner.close();
    }

    private static int getChoiceFromMenu() {
        Scanner input = new Scanner(System.in);

        System.out.print("Что вы хотите сделать с введённым числом?\n");
        System.out.print("""
                1. Конвертация в мили.
                2. Конвертация в дюймы.
                3. Конвертация в ярды.
                Ваш выбор:
                """);
        int selectionNumber = parseInt(input.nextLine());

        input.close();
        return selectionNumber;
    }
}
