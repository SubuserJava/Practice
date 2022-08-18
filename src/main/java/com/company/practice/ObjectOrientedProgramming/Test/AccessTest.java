package com.company.practice.ObjectOrientedProgramming.Test;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AccessTest {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Test object = new Test();

        object.a = 10;
        object.b = 20;

        // object.c = 100;

        object.setC(100);
        System.out.println("a - " + object.a + ", b - " + object.b + ", c - " + object.getC());
        System.out.println("Вывод в консоль кириллица.");
    }
}
