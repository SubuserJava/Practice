package com.company.practice.PracticeFromAcademy.Practice09;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку, состоящую из любых символов.\nВвод строки: ");
        String inputString = scanner.nextLine();
        System.out.print("Введите слово для поиска в строке: ");
        String inputSearchWord = scanner.nextLine();

        System.out.printf("Слово или символ '%s' встречается %d раз в строке. Метод 1 (без массивов).\n", inputSearchWord, getSearchCountMethod1(inputString, inputSearchWord));
        System.out.printf("Слово '%s' встречается %d раз в строке. Метод 2 (с массивами).", inputSearchWord, getSearchCountMethod2(inputString, inputSearchWord));

        scanner.close();
    }

    private static int getSearchCountMethod2(String inputString, String inputSearchWord) {
        String[] stringsArray = inputString.trim().split(" ");
        int countMatches = 0;
        for (String current : stringsArray) {
            if (current.equals(inputSearchWord)) countMatches++;
        }
        return countMatches;
    }

    private static int getSearchCountMethod1(String inputString, String inputSearchWord) {
        return inputString.isEmpty() | inputSearchWord.isEmpty() ? 0 :
                (inputString.length() - inputString.replaceAll(inputSearchWord, "").length()) / inputSearchWord.length();
    }
}
