package com.company.practice.ObjectOrientedProgramming.Threads.ExampleMultiThread2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class MultiThreadJoinDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        NewThread4 newThread1 = new NewThread4("Один");
        NewThread4 newThread2 = new NewThread4("Два");
        NewThread4 newThread3 = new NewThread4("Три");

        System.out.printf("Поток '%s' запущен: %s\n", newThread1.name, newThread1.thread.isAlive());
        System.out.printf("Поток '%s' запущен: %s\n", newThread2.name, newThread2.thread.isAlive());
        System.out.printf("Поток '%s' запущен: %s\n", newThread3.name, newThread3.thread.isAlive());

        try {
            System.out.println("Ожидание завершения потоков.");
            newThread1.thread.join();
            newThread2.thread.join();
            newThread3.thread.join();
        } catch (InterruptedException exception) {
            System.out.println("Главный поток прерван.");
        }

        System.out.printf("Поток '%s' запущен: %s\n", newThread1.name, newThread1.thread.isAlive());
        System.out.printf("Поток '%s' запущен: %s\n", newThread2.name, newThread2.thread.isAlive());
        System.out.printf("Поток '%s' запущен: %s\n", newThread3.name, newThread3.thread.isAlive());
    }
}