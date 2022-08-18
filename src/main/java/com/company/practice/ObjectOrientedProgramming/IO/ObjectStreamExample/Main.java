package com.company.practice.ObjectOrientedProgramming.IO.ObjectStreamExample;

import java.io.*;
import java.util.HashMap;

import static com.company.practice.ObjectOrientedProgramming.IO.FileInputStreamExample.Main.createNewFileIfNotExist;

public class Main {

    public static void main(String[] args) {

        File fileOutput = new File("Z:/JavaProjects/DifferentTests/example_directory/run/skip/java/output.txt");
        createNewFileIfNotExist(fileOutput);

        try (InputStream inputStream = new FileInputStream("Z:/JavaProjects/DifferentTests/example_directory/run/skip/java/output.txt");
             OutputStream outputStream = new FileOutputStream("Z:/JavaProjects/DifferentTests/example_directory/run/skip/java/output.txt")) {

            Contact contact = new Contact(1L, "Java SE", null);
            User user = new User(111L, "username");
            HashMap<User, Contact> map = new HashMap<>();
            map.put(user, contact);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(map);

            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            HashMap<User, Contact> mapFromByes = (HashMap<User, Contact>) objectInputStream.readObject();
            System.out.println(mapFromByes);

//            byte[] buffer = new byte[inputStream.available()];
//            inputStream.read(buffer);
//            System.out.println(new String(buffer));
//            outputStream.write(buffer);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }

    }
}
