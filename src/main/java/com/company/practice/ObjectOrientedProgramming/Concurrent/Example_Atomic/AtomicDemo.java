package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Atomic;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AtomicDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        new Thread(new AtomicThread("A")).start();
        new Thread(new AtomicThread("B")).start();
        new Thread(new AtomicThread("C")).start();
//        new Thread(new AtomicThread("D")).start();
//        new Thread(new AtomicThread("E")).start();
//        new Thread(new AtomicThread("F")).start();
    }
}
