package com.company.practice.ObjectOrientedProgramming.Threads.CurrentThread;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class CurrentThreadDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Thread thread = Thread.currentThread();

        System.out.println("Текущий поток исполнения " + thread);

        thread.setName("My Thread");
        System.out.println("После изменения имени потока " + thread);

        try {
            for (int index = 5; index > 0; index--) {
                System.out.println(index);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
