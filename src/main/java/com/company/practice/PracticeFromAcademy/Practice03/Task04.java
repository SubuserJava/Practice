package com.company.practice.PracticeFromAcademy.Practice03;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

// Пользователь вводит с клавиатуры два числа. Первое
//число — это значение, второе число процент, который
//необходимо посчитать. Например, мы ввели с клавиатуры
//50 и 10. Требуется вывести на экран 10 процентов от 50.
//Результат: 5.
public class Task04 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число и процент.\nЧисло: ");
        int number = scanner.nextInt();
        System.out.print("Процент: ");
        int percent = scanner.nextInt();

        System.out.printf("%s процентов от %s = %d", percent, number, number * percent / 100);
        scanner.close();
    }
}
