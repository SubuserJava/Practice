package com.company.practice.ObjectOrientedProgramming.Concurrent.Example3_Semaphore;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Semaphore;

public class Runner {

    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Semaphore semaphore = new Semaphore(4);

        new Thread(new ExpressionThread(semaphore, "A")).start();
        new Thread(new ExpressionThread(semaphore, "B")).start();
        new Thread(new ExpressionThread(semaphore, "C")).start();
        new Thread(new ExpressionThread(semaphore, "D")).start();
    }
}
