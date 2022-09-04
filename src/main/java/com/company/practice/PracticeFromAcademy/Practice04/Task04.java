package com.company.practice.PracticeFromAcademy.Practice04;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите основание треугольника: ");
        int baseTriangle = scanner.nextInt();
        System.out.print("Введите высоту треугольника: ");
        int highTriangle = scanner.nextInt();

        System.out.printf("Площадь треугольника: %s", getAreaOfTriangle(baseTriangle, highTriangle));

        scanner.close();
    }

    private static double getAreaOfTriangle(int baseTriangle, int highTriangle) {
        return 0.5D * baseTriangle * highTriangle;
    }
}
