package com.company.practice.PracticeFromAcademy.Practice09;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку состоящую из цифр или букв для проверки на палиндром.\nВвод строки: ");
        String inputString = scanner.nextLine();

        if (new Scanner(inputString).hasNextInt()) {
            System.out.printf("Var.1 Введённое число%s является палиндромом.\n", isDigitPalindrome(inputString) ? "" : " не");
            System.out.printf("Var.2 Введённое число%s является палиндромом.\n", isStringPalindromeMethod2(inputString) ? "" : " не");
        } else {
            System.out.printf("Var.1 Введённая строка%s является палиндромом.\n", isStringPalindromeMethod1(inputString) ? "" : " не");
            System.out.printf("Var.2 Введённая строка%s является палиндромом.\n", isStringPalindromeMethod2(inputString) ? "" : " не");
        }

        scanner.close();
    }

    private static boolean isDigitPalindrome(String inputString) {
        char[] charsArray = inputString.toCharArray();
        for (int index = 0; index < charsArray.length / 2; index++) {
            if (charsArray[index] != charsArray[charsArray.length - index - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isStringPalindromeMethod1(String inputString) {
        char[] stringsArray = inputString.toLowerCase(Locale.ROOT).trim().replaceAll("[^\\da-zа-я]", "").toCharArray();
        for (int index = 0; index < stringsArray.length / 2; index++) {
            if (stringsArray[index] != stringsArray[stringsArray.length - index - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isStringPalindromeMethod2(String inputString) {
        return inputString.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(inputString.replaceAll("\\W", ""))
                        .reverse().toString());
    }


}
