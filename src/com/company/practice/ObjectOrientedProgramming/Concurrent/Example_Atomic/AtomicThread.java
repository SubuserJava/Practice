package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Atomic;

public class AtomicThread implements Runnable {

    public String name;

    public AtomicThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println("Запуск потока " + name);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Поток: " + name + " получено: " + Shared1.atomicInteger.getAndSet(i));
        }
        System.out.println("----");
    }
}
