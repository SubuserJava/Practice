package com.company.practice.ObjectOrientedProgramming.Threads.SynchThread.NotSynch;

public class Caller1 implements Runnable{

    String message;
    Callme1 target;
    Thread thread;

    public Caller1(Callme1 target, String message) {
        this.target = target;
        this.message = message;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        this.target.call(message);
    }
}
