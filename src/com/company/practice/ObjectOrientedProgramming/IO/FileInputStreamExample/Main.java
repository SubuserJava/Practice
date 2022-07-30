package com.company.practice.ObjectOrientedProgramming.IO.FileInputStreamExample;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File fileOutput = new File("G:/Business/My/JavaProjects/Practice/example_directory/run/skip/java/output.txt");
        createNewFileIfNotExist(fileOutput);

        try (InputStream inputStream = new FileInputStream("G:/Business/My/JavaProjects/Practice/example_directory/run/skip/java/exampleFile.txt");
             OutputStream outputStream = new FileOutputStream("G:/Business/My/JavaProjects/Practice/example_directory/run/skip/java/output.txt")) {
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            System.out.println(new String(buffer));
            outputStream.write(buffer);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void createNewFileIfNotExist(File fileOutput) {
        if (fileOutput.exists()) {
            return;
        }
        try {
            fileOutput.createNewFile();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
