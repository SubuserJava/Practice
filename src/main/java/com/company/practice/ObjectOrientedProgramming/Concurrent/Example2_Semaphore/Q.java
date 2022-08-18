package com.company.practice.ObjectOrientedProgramming.Concurrent.Example2_Semaphore;

import java.util.concurrent.Semaphore;

public class Q {

    private int n;

    static Semaphore semaphoreConsumer = new Semaphore(0);
    static Semaphore semaphoreProducer = new Semaphore(1);

    public void get() throws InterruptedException {
        try {
            semaphoreConsumer.acquire();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Получено: " + n);
        Thread.sleep(500);
        semaphoreProducer.release();
    }

    public void put(int n) throws InterruptedException {
        try {
            semaphoreProducer.acquire();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        this.n = n;
        System.out.println("Отправлено: " + n);
        Thread.sleep(500);
        semaphoreConsumer.release();
    }
}
