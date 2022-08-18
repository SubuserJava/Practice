package com.company.practice.DiffTests;

public class Main {

    public static void main(String[] args) {

        String a = "aaAAa   hhhhHHHH";

        char[] chars = a.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }

        System.out.println(new String(chars));


    }
}


