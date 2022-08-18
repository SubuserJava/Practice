package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Phaser.Example1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Phaser;

public class PhaserDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out,true, StandardCharsets.UTF_8));

        Phaser threadPhaser = new Phaser(1);
        int currentPhase;

        System.out.print("Запуск потоков\n");

        new Thread(new MyThread4(threadPhaser,"A")).start();
        new Thread(new MyThread4(threadPhaser,"B")).start();
        new Thread(new MyThread4(threadPhaser,"C")).start();

        currentPhase = threadPhaser.getPhase();
        threadPhaser.arriveAndAwaitAdvance();
        System.out.print("Фаза " + currentPhase + " завершена.\n");

        currentPhase = threadPhaser.getPhase();
        threadPhaser.arriveAndAwaitAdvance();
        System.out.print("Фаза " + currentPhase + " завершена.\n");

        currentPhase = threadPhaser.getPhase();
        threadPhaser.arriveAndAwaitAdvance();
        System.out.print("Фаза " + currentPhase + " завершена.\n");

        threadPhaser.arriveAndDeregister();

        if (threadPhaser.isTerminated()) {
            System.out.println("Синхронизатор фаз завершён.");
        }
    }
}
