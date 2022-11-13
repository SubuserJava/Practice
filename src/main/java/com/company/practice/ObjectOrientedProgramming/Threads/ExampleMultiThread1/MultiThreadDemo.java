package com.company.practice.ObjectOrientedProgramming.Threads.ExampleMultiThread1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class MultiThreadDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        new NewThread3("Один");
        new NewThread3("Два");
        new NewThread3("Три");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException exception) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершён.");
    }
}
