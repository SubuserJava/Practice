package com.company.practice.ObjectOrientedProgramming.Threads.SynchThread.NotSynch;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Synch1 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Callme1 target = new Callme1();
        Caller1 object1 = new Caller1(target, "Добро пожаловать");
        Caller1 object2 = new Caller1(target, "в синхронизированный");
        Caller1 object3 = new Caller1(target, "мир!");

        try {
            object1.thread.join();
            object2.thread.join();
            object3.thread.join();
        } catch (InterruptedException exception) {
            System.out.println("Прервано.");
        }
    }
}
