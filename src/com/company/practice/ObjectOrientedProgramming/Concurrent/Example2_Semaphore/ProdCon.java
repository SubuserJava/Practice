package com.company.practice.ObjectOrientedProgramming.Concurrent.Example2_Semaphore;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class ProdCon {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Q q = new Q();

        new Thread(new Consumer(q), "Consumer").start();
        new Thread(new Producer(q), "Producer").start();
    }
}
