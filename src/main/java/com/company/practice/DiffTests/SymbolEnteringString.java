package com.company.practice.DiffTests;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SymbolEnteringString {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Enter symbol(s): ");
        String dataInput = consoleInput.nextLine();
        char fromConsole = dataInput.charAt(0); // dataInput.length() - 3

        System.out.println(dataInput + " " + fromConsole);

        System.out.println("Your type of symbol is: " + getCharType(fromConsole));
    }

    private static String getCharType(char fromConsole) {
        if (Character.isDigit(fromConsole)) {
            return "Digital";
        } else if (Character.isAlphabetic(fromConsole)) {
            if (Character.UnicodeBlock.of(fromConsole).equals(Character.UnicodeBlock.CYRILLIC)) {
                return "Cyrillic";
            } else if (Character.UnicodeBlock.of(fromConsole).equals(Character.UnicodeBlock.BASIC_LATIN)) {
                return "Latin";
            }
        }
        return "Unknown character type";
    }
}
