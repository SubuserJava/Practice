package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable {

    private String name;
    ReentrantLock lock;

    public LockThread(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {

        System.out.print("Запуск потока '" + name + "'.\n");
        while (true) {
            try {
                System.out.print("Поток '" + name + "' ожидает блокировки счётчика.\n");
                lock.lock();
                System.out.print("Поток '" + name + "' блокирует счётчик.\n");
                Shared2.count++;
                System.out.print("Поток '" + name + "': " + Shared2.count + "\n");
                int sleep = 1000 * ((int) (Math.random() * 6));
                System.out.printf("Поток '%s' ожидает %s сек.\n", name, sleep / 1000);
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.print("Поток '" + name + "' разблокирует счётчик.\n");
                lock.unlock();
            }
        }
    }
}