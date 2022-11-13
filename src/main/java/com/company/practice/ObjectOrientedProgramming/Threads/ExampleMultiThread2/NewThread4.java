package com.company.practice.ObjectOrientedProgramming.Threads.ExampleMultiThread2;

public class NewThread4 implements Runnable{

    String name;
    Thread thread;

    public NewThread4(String threadName) {
        this.name = threadName;
        thread = new Thread(this, threadName);
        System.out.println("Новый поток: " + thread);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int index = 5; index > 0; index--) {
                System.out.println(name + ": " + index);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            System.out.println("Поток '" + name + "' прерван.");
        }
        System.out.println("Поток '" + name + "' завершён.");
    }
}
