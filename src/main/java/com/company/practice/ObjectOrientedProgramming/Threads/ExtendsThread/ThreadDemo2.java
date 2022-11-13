package com.company.practice.ObjectOrientedProgramming.Threads.ExtendsThread;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class ThreadDemo2 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        new NewThread2();

        try {
            for (int index = 5; index > 0; index--) {
                System.out.println("Главный поток: " + index);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершён.");
    }
}
