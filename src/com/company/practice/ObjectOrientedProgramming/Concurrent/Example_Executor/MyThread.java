package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Executor;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{

    public String name;
    CountDownLatch latch;

    public MyThread(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int index = 0; index < 5; index++) {
            System.out.println(name + ": " + index);
            latch.countDown();

        }
    }
}
