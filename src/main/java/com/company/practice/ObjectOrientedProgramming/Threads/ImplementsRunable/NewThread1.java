package com.company.practice.ObjectOrientedProgramming.Threads.ImplementsRunable;

public class NewThread1 implements Runnable {

    Thread thread;

    public NewThread1() {
        thread = new Thread(this, "Демонстрационный поток.");
        System.out.println("Дочерний поток создан: " + thread);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int index = 5; index > 0; index--) {
                System.out.println("Дочерний поток: " + index);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершён.");
    }
}
