package com.company.practice.ObjectOrientedProgramming.Concurrent.Example3_CountDownLatch;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;

public class CDLDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        CountDownLatch countDownLatch1 = new CountDownLatch(5);

        System.out.println("Запуск потока исполнения.");
        new Thread(new MyThread(countDownLatch1)).start();

        try {
            countDownLatch1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершение потока исполнения.");
    }
}
