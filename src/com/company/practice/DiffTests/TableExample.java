package com.company.practice.DiffTests;

import java.util.Random;

public class TableExample {

    static final Random r = new Random();
    static final String cc = "abcdefg";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StringBuilder format = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            format.append("#%").append(i).append("$10s");
        }
        format.append("#");
        StringBuilder border = new StringBuilder();
        for (int i = 0; i < 56; i++) {
            border.append("#");
        }
        System.out.println(border.toString());
        for (int i = 0; i < 5; i++) {
            String out = String.format(format.toString(), (Object) getRandomString(5));
            System.out.println(out);
        }
        System.out.println(border.toString());
    }

    static String[] getRandomString(int size) {
        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++) {
            int start = r.nextInt(cc.length());
            int end = r.nextInt(cc.length());
            if (start > end) {
                int tmp = end;
                end = start;
                start = tmp;
            }
            arr[i] = cc.substring(start, end) + " ";
        }
        return arr;
    }
}