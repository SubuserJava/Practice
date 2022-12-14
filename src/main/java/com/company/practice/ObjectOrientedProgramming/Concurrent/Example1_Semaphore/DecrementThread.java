package com.company.practice.ObjectOrientedProgramming.Concurrent.Example1_Semaphore;

import java.util.concurrent.Semaphore;

public class DecrementThread implements Runnable {

    private Semaphore semaphore;
    private String name;

    public DecrementThread(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {

        do {
            System.out.print("Запуск потока '" + name + "'\n");
            try {
                System.out.print("Поток '" + name + "' ожидает разрешения.\n");
                semaphore.acquire();
                System.out.print("Поток '" + name + "' получает разрешения.\n");
                for (int i = 0; i < 5; i++) {
                    Shared.count--;
                    System.out.print(name + ": " + Shared.count + "\n");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Состояние потока: %s\n", Thread.currentThread().isAlive());
            System.out.print("Поток '" + name + "' освобождает разрешение.\n");
            semaphore.release();
            System.out.printf("Состояние потока: %s\n", Thread.currentThread().isInterrupted());
        } while (true);
    }
}
