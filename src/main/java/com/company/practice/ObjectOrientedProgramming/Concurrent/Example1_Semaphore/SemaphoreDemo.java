package com.company.practice.ObjectOrientedProgramming.Concurrent.Example1_Semaphore;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Semaphore semaphore = new Semaphore(2);

        new Thread(new IncrementThread(semaphore, "A +")).start();
        new Thread(new DecrementThread(semaphore, "B -")).start();
        new Thread(new IncrementThread(semaphore, "C +")).start();
        new Thread(new DecrementThread(semaphore, "D -")).start();
    }
}
