package com.company.practice.PracticeFromAcademy.Practice09;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку, состоящую из любых символов.\nВвод строки: ");
        String inputString = scanner.nextLine();
        System.out.print("Введите слово для поиска в строке: ");
        String inputSearchWord = scanner.nextLine();
        System.out.print("Введите слово для замены: ");
        String replacementWord = scanner.nextLine();

        System.out.printf("Строка с заменёнными словами: %s", getSearchAndReplace(inputString, inputSearchWord, replacementWord));

        scanner.close();
    }

    private static String getSearchAndReplace(String inputString, String inputSearchWord, String replacementWord) {
        String[] stringsArray = inputString.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String current : stringsArray) {
            if (current.equals(inputSearchWord)) {
                stringBuilder.append(replacementWord).append(" ");
            } else {
                stringBuilder.append(current).append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
