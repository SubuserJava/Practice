package com.company.practice.ObjectOrientedProgramming.Concurrent.Example3_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {

    CountDownLatch latch;

    public MyThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
            latch.countDown();
            System.out.println("Current latch count: " + latch.getCount());
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
