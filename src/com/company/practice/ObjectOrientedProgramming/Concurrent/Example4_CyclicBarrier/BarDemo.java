package com.company.practice.ObjectOrientedProgramming.Concurrent.Example4_CyclicBarrier;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new BarrierAction());
        System.out.println("Запуск потоков.");

        new Thread(new MyThread2(cyclicBarrier, "A")).start();
        new Thread(new MyThread2(cyclicBarrier, "B")).start();
        new Thread(new MyThread2(cyclicBarrier, "C")).start();
        new Thread(new MyThread2(cyclicBarrier, "X")).start();
        new Thread(new MyThread2(cyclicBarrier, "Y")).start();
        new Thread(new MyThread2(cyclicBarrier, "Z")).start();
    }
}
