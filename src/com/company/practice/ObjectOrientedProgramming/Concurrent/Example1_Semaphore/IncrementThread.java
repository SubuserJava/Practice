package com.company.practice.ObjectOrientedProgramming.Concurrent.Example1_Semaphore;

import java.util.concurrent.Semaphore;

public class IncrementThread implements Runnable {

    private Semaphore semaphore;
    private String name;

    public IncrementThread(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.print("Запуск потока '" + name + "'\n");
        try {
            System.out.print("Поток '" + name + "' ожидает разрешения.\n");
            semaphore.acquire();
            System.out.print("Поток '" + name + "' получает разрешения.\n");
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.print(name + ": " + Shared.count + "\n");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Поток '" + name + "' освобождает разрешение.\n");
        semaphore.release();
    }
}
