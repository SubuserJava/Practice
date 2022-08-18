package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Callable_Future;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.*;

public class CallableDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> future1;
        Future<Double> future2;
        Future<Integer> future3;

        System.out.println("Запуск.");

        future1 = executorService.submit(new Sum(10));
        future2 = executorService.submit(new Hypot(3D, 4D));
        future3 = executorService.submit(new Factorial(5));

        try {
            System.out.println(future1.get(10, TimeUnit.MILLISECONDS));
            System.out.println(future2.get(10, TimeUnit.MILLISECONDS));
            System.out.println(future3.get(10, TimeUnit.MILLISECONDS));
        } catch (ExecutionException | InterruptedException | TimeoutException exception) {
            exception.printStackTrace();
        }
        executorService.shutdown();
        System.out.println("Завершение.");
    }
}
