package com.company.practice.ObjectOrientedProgramming.Concurrent.Example4_CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread2 implements Runnable {

    private CyclicBarrier cyclicBarrier;
    private String name;

    public MyThread2(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread: " + name);
        System.out.println(Shared3.count);
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
