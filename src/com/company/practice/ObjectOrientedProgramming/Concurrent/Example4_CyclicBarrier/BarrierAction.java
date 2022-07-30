package com.company.practice.ObjectOrientedProgramming.Concurrent.Example4_CyclicBarrier;

public class BarrierAction implements Runnable{

    @Override
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}
