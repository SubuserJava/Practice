package com.company.practice.ObjectOrientedProgramming.IO.Practice25.Task3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        int countWordRepeat = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the path to file: ");
            String path = scanner.nextLine();
            System.out.print("Enter the word for search and count amount of the word: ");
            String wordForSearch = scanner.nextLine();
            try (FileInputStream fileInputStream = new FileInputStream(path)) {
                byte[] buffer = new byte[fileInputStream.available()];
                fileInputStream.read(buffer);
                String fileContent = new String(buffer);
                fileContent = fileContent.replaceAll("\n", " ");
                System.out.println(fileContent);
                String[] words = fileContent.split(" ");
                for (String word : words) {
                    if (word.equals(wordForSearch)) {
                        countWordRepeat++;
                    }
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            System.out.print("Amount of repeat: " + countWordRepeat);
        }
    }
}
