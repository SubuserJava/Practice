package com.company.practice.ObjectOrientedProgramming.Threads.ExtendsThread;

public class NewThread2 extends Thread{

    public NewThread2() {
        super("Демонстрационный поток.");
        System.out.println("Дочерний поток " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int index = 5; index > 0; index--) {
                System.out.println("Дочерний поток: " + index);
                Thread.sleep(500);
            }
        } catch (InterruptedException exception) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерний поток завершён.");
    }
}
