package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Phaser.Example1;

import java.util.concurrent.Phaser;

public class MyThread4 implements Runnable {

    Phaser phaser;
    String name;

    public MyThread4(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {

        System.out.print("Поток " + name + " начинает первую файзу.\n");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        System.out.print("Поток " + name + " начинает вторую файзу.\n");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        System.out.print("Поток " + name + " начинает третью файзу.\n");
        phaser.arriveAndDeregister();
    }
}
