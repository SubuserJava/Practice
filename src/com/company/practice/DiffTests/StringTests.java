package com.company.practice.DiffTests;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringTests {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        char[] charsArray = {'а', 'б', 'в', 'г'};
        int[] integerArray = {65, 66, 67, 68};

        String strObj1 = "Это 1232 'роверка. ')И это&8 тоже.";
        String[] wordsFromSentenceArray = strObj1.split("(?U)\\W+");
        System.out.println("New string - " + wordsFromSentenceArray[0] + wordsFromSentenceArray[1]+wordsFromSentenceArray[2]+wordsFromSentenceArray[3]);

        System.out.println(Arrays.toString(integerArray).replaceAll(",|\\[|\\]", ""));

        System.out.println(strObj1);
        String header1 = "5.19e-4";
        String header2 = "Type of rate";
        String header3 = "Total amount";
        StringBuilder header = new StringBuilder();


        System.out.println("""
                1. Enter.
                2. Exit.
                Your choice\s
                """);

    }
}
