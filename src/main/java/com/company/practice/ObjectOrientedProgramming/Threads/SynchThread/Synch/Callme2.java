package com.company.practice.ObjectOrientedProgramming.Threads.SynchThread.Synch;

public class Callme2 {

    public void call(String message) {
        System.out.print("[" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            System.out.println("Прервано.");
        }
        System.out.println("]");
    }
}
