package com.company.practice.ObjectOrientedProgramming.Concurrent.Example3_Semaphore;

import java.util.concurrent.Semaphore;

public class ExpressionThread implements Runnable {
    private Semaphore semaphore;
    private String name;

    public ExpressionThread(Semaphore semaphore, String name) {
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
                    Shared4.count++;
                    System.out.print(name + ": " + Shared4.count + "\n");
                    sleepThread();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Состояние потока %s: %s\n", name, Thread.currentThread().isAlive());
            System.out.print("Поток '" + name + "' освобождает разрешение.\n");
            semaphore.release();
            System.out.printf("Состояние потока %s: %s\n", name, Thread.currentThread().isInterrupted());
        } while (true);
    }

    private void sleepThread() throws InterruptedException {
        int sleep = 1000 * ((int) (Math.random() * 6));
        Thread.sleep(sleep);
    }
}
