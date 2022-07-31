package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Phaser.Example2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PhaserDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        MyPhaser phaser = new MyPhaser(1, 4);

        System.out.print("Запуск потоков\n");

        new Thread(new MyThread1(phaser, "A")).start();
        new Thread(new MyThread1(phaser, "B")).start();
        new Thread(new MyThread1(phaser, "C")).start();

        while (!phaser.isTerminated()) {
            phaser.arriveAndAwaitAdvance();
        }
        System.out.print("Синхронизатор фаз завершён.\n");

    }
}
