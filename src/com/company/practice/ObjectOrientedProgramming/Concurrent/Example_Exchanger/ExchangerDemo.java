package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Exchanger;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Exchanger;

public class ExchangerDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Exchanger<String> exgr = new Exchanger<String>();

        new Thread(new UseString(exgr)).start();
        new Thread(new MakeString(exgr)).start();
    }
}
