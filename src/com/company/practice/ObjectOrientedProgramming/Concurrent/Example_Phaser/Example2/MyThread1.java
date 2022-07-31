package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Phaser.Example2;

import java.util.concurrent.Phaser;

public class MyThread1 implements Runnable{

    Phaser phaser;
    String name;

    public MyThread1(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()) {
            System.out.println("Поток" + name + " начинает фазу " + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
