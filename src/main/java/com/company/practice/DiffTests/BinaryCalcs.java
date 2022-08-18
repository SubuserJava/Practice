package com.company.practice.DiffTests;

public class BinaryCalcs {

    public static void main(String[] args) {

        int a = 12345;

        String d1 = Integer.toString(a);
        char[] d3 = new char[d1.length()];

        for (int i = 0; i < 5; i++) {
            d3[i] = d1.charAt(i);
            System.out.println(d3[i]);
        }
    }
}
