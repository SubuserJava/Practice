package com.company.practice.ObjectOrientedProgramming.Concurrent.Practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FromLesson21062022 {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("exit")) {
                    break;
                }
                list.add(Integer.valueOf(line));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        Future<Integer> maxResult = executorService.submit(() -> list.stream().mapToInt(i -> i).max().orElse(0));
        Future<Integer> minResult = executorService.submit(() -> list.stream().mapToInt(i -> i).min().orElse(0));

        System.out.println(maxResult.get());
        System.out.println(minResult.get());

        executorService.shutdown();
    }
}
