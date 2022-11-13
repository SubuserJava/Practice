package com.company.practice.ObjectOrientedProgramming.Threads.SynchThread.Synch;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Synch2 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Callme2 target = new Callme2();
        Caller2 object1 = new Caller2(target, "Добро пожаловать");
        Caller2 object2 = new Caller2(target, "в синхронизированный");
        Caller2 object3 = new Caller2(target, "мир!");

        try {
            object1.thread.join();
            object2.thread.join();
            object3.thread.join();
        } catch (InterruptedException exception) {
            System.out.println("Прервано.");
        }
    }
}
