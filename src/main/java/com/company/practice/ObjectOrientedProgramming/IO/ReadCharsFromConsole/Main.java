package com.company.practice.ObjectOrientedProgramming.IO.ReadCharsFromConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        char c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any characters. Enter 'q' for exit: ");
        do {
            c = (char) bufferedReader.read();
            System.out.print(c + "\n");
        } while (c != 'q');


        String string;
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string expressions. Enter 'quit' for exit: ");
        do {
            string = bufferedReader1.readLine();
            System.out.print(string + "\n");
        } while (!string.equals("quit"));

    }
}
