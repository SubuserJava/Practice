package com.company.practice.PracticeFromAcademy.Practice03;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

// Напишите программу, вычисляющую площадь ква-
//драта. Пользователь с клавиатуры вводит размер стороны
//квадрата.
public class Task05 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону квадрата.\nСторона квадрата: ");
        int sideOfSquare = scanner.nextInt();

        System.out.printf("Площадь квадарата со стороной %s: %d", sideOfSquare, sideOfSquare * sideOfSquare);
        scanner.close();
    }
}
