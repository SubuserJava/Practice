package com.company.practice.ObjectOrientedProgramming.Concurrent.Example2_Semaphore;

import java.util.concurrent.Semaphore;

public class Q {

    private int n;

    static Semaphore semaphoreConsumer = new Semaphore(0);
    static Semaphore semaphoreProducer = new Semaphore(1);

    public void get(int i) {
        try {
            semaphoreConsumer.acquire();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Получено: " + n);
        semaphoreProducer.release();
    }

    public void put(int n) {
        try {
            semaphoreProducer.acquire();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        this.n = n;
        System.out.println("Отпрвлено: " + n);
        semaphoreConsumer.release();
    }
}
