package com.company.practice.ObjectOrientedProgramming.IO.Examples;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File directory = new File ("G:/Business/My/JavaProjects/Practice/example_directory/run/skip/java");
        directory.mkdirs();

        File fileByPath = new File("G:/Business/My/JavaProjects/Practice/example_directory/run/skip/java/exampleFile.txt");
        if (!fileByPath.isFile()) {
            try {
                if (fileByPath.createNewFile()) {
                    System.out.println("file was create");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        Thread.sleep(5000);
//        System.out.println(fileByPath.setReadOnly());
//        fileByPath.deleteOnExit();
    }
}

