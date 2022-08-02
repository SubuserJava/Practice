package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Executor;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutor {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        CountDownLatch cdl1 = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков.");

        executorService.execute(new MyThread3("A", cdl1));
        executorService.execute(new MyThread3("B", cdl2));
        executorService.execute(new MyThread3("C", cdl3));
        executorService.execute(new MyThread3("D", cdl4));

        try {
            cdl1.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        executorService.shutdown();
        System.out.println("Завершение потоков.");
    }
}
