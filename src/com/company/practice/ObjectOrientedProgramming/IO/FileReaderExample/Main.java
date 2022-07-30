package com.company.practice.ObjectOrientedProgramming.IO.FileReaderExample;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("G:/Business/My/JavaProjects/Practice/example_directory/run/skip/java/exampleFile.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("G:/Business/My/JavaProjects/Practice/example_directory/run/skip/java/output.txt"))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}