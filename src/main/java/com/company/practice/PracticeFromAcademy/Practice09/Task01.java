package com.company.practice.PracticeFromAcademy.Practice09;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, состоящую из любых символов");
        String inputString = scanner.nextLine();
        System.out.println("Метод 1 (без массивов): " + getReverseStringMethod1(inputString));
        System.out.println("Метод 2 (с массивами): " + getReverseStringMethod2(inputString));

        scanner.close();
    }

    private static String getReverseStringMethod2(String inputString) {
        char[] stringsArray = inputString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int index = stringsArray.length - 1; index >= 0; index--) {
            stringBuilder.append(stringsArray[index]);
        }
        return stringBuilder.toString();
    }

    private static String getReverseStringMethod1(String originalString) {
        return originalString.isEmpty() ? "" : new StringBuilder(originalString).reverse().toString();
    }


}
