package com.company.practice.ObjectOrientedProgramming.IO.Practice25.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getSimpleName());

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a path to file: ");
            String path = scanner.nextLine();

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) { // Z:/JavaProjects/DifferentTests/example_directory/run/skip/java/output.txt
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (Exception e) {
                e.printStackTrace();
                logger.log(Level.INFO, String.format("File '%s' not found", path));

            }
        }
    }
}
