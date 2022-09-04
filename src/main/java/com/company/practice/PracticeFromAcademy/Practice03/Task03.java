package com.company.practice.PracticeFromAcademy.Practice03;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//Пользователь вводит с клавиатуры два числа. Необ-
//ходимо найти сумму чисел, разницу чисел, произведение
//числе. Результат вычислений вывести на экран.
public class Task03 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 2 числа.\nПервое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Второе число: ");
        int secondNum = scanner.nextInt();

        System.out.printf("Сумма чисел %s и %s: %d\n",firstNum, secondNum, firstNum + secondNum);
        System.out.printf("Разница чисел %s и %s: %d\n", firstNum, secondNum, firstNum - secondNum);
        System.out.printf("Произведение чисел %s и %s: %d", firstNum, secondNum, firstNum * secondNum);
        scanner.close();
    }
}
