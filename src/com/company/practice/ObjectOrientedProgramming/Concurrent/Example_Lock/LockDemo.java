package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Lock;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        new Thread(new LockThread("A", lock)).start();
        new Thread(new LockThread("B", lock)).start();
    }
}
