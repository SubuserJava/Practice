package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Exchanger;

import java.util.concurrent.Exchanger;

class UseString implements Runnable {

    Exchanger<String> ex;
    String str;

    public UseString(Exchanger<String> c) {
        this.ex = c;
    }

    @Override
    public void run() {
        for (int index = 0; index < 3; index++) {
            try {
                str = ex.exchange(new String());
                System.out.print("Получено: " + str + "\n");
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
