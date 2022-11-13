package com.company.practice.PracticeFromAcademy.Practice09;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Task05 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        String originalText = "пользователь вводит с 43545 клавиатуры строку. проверьте, " +
                "является 3 ли введенная строка палиндромом. Палин" +
                "дром — слово 5 или текст, которое 8 читается одинаково " +
                "слева направо и 6 справа налево. например, кок; А роза " +
                "упала на лапу Азора; доход; А буду я у дуба8.";

        System.out.printf("1. Каждое предложение начинается с большой буквы.\nИзменённый текст: %s\n", getChangeTextBeginSentenceToUpper(originalText));
        System.out.printf("2. Цифры встречаются в тексте %d раз.\n", getCountNumbers(originalText));
        System.out.printf("3. Знаки препинания встречаются в тексте %d раз.\n", getCountPunctuationMark(originalText));
        System.out.printf("4. Количество предложений в тексте: %d", getCountSentences(originalText));
    }

    private static int getCountSentences(String originalText) {
        if(originalText == null || originalText.isEmpty())
            return 0;

        return originalText.split("\\.").length - 1;
    }

    private static int getCountPunctuationMark(String originalText) {
        if(originalText == null || originalText.isEmpty())
            return 0;

        char[] charsArray = originalText.toCharArray();
        int count = 0;
        for (char current : charsArray) {
            if (!(Character.isLetterOrDigit(current) || Character.isSpaceChar(current))) count++;
        }
        return count;
    }

    private static int getCountNumbers(String originalText) {
        if(originalText == null || originalText.isEmpty())
            return 0;

        char[] charsArray = originalText.toCharArray();
        int count = 0;
        for (char current : charsArray) {
            if (Character.isDigit(current)) count++;
        }
        return count;
    }

    private static String getChangeTextBeginSentenceToUpper(String originalText) {
        if(originalText == null || originalText.isEmpty())
            return "";

        originalText += " ";
        String[] sentencesArray = originalText.split("\\.\\ ");
        for (int index = 0; index < sentencesArray.length; index++) {
            sentencesArray[index] = sentencesArray[index].substring(0, 1).toUpperCase() + sentencesArray[index].substring(1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String current : sentencesArray) {
            stringBuilder.append(current).append(". ");
        }
        return stringBuilder.toString().replaceAll(".$", "");
    }
}
