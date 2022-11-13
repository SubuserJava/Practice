package com.company.practice.ObjectOrientedProgramming.Threads.SynchThread.NotSynch;

public class Callme1 {

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
