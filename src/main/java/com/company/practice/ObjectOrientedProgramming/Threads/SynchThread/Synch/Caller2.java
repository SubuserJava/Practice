package com.company.practice.ObjectOrientedProgramming.Threads.SynchThread.Synch;

public class Caller2 implements Runnable {

    String message;
    Callme2 target;
    Thread thread;

    public Caller2(Callme2 target, String message) {
        this.target = target;
        this.message = message;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            this.target.call(message);
        }
    }
}
