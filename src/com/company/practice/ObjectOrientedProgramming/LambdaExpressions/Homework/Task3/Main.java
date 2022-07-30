package com.company.practice.ObjectOrientedProgramming.LambdaExpressions.Homework.Task3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    /**
     * Все лямбда-выражения сделаны по образцу, кроме String. Критерий min max строки взят по alfa-beta (natural order).
     */
    public static void main(String[] args) {

// Byte
        MaxMinFrom3Number<Byte> maxByteType;
        maxByteType = (aValue, bValue, cValue) -> {
            Byte maxNumber = aValue;
            if (maxNumber < bValue) maxNumber = bValue;
            if (maxNumber < cValue) maxNumber = cValue;
            return maxNumber;
        };

        byte byteMax = maxByteType.MaxMinObj((byte) 5, (byte) 7, (byte) 3);
        System.out.println("Maximum of three byte numbers: " + byteMax);

        MaxMinFrom3Number<Byte> minByteType;
        minByteType = (aValue, bValue, cValue) -> {
            Byte minNumber = aValue;
            if (minNumber > bValue) minNumber = bValue;
            if (minNumber > cValue) minNumber = cValue;
            return minNumber;
        };

        byte byteMin = minByteType.MaxMinObj((byte) 5, (byte) 7, (byte) 3);
        System.out.println("Minimum of three byte numbers: " + byteMin);
// Short
        MaxMinFrom3Number<Short> maxShortType;
        maxShortType = (aValue, bValue, cValue) -> {
            Short maxNumber = aValue;
            if (maxNumber < bValue) maxNumber = bValue;
            if (maxNumber < cValue) maxNumber = cValue;
            return maxNumber;
        };

        short shortMax = maxShortType.MaxMinObj((short) 5, (short) 7, (short) 3);
        System.out.println("Maximum of three short numbers: " + shortMax);

        MaxMinFrom3Number<Short> minShortType;
        minShortType = (aValue, bValue, cValue) -> {
            Short minNumber = aValue;
            if (minNumber > bValue) minNumber = bValue;
            if (minNumber > cValue) minNumber = cValue;
            return minNumber;
        };

        short shortMin = minShortType.MaxMinObj((short) 5, (short) 7, (short) 3);
        System.out.println("Minimum of three short numbers: " + shortMin);
// Integer
        MaxMinFrom3Number<Integer> maxIntegerType;
        maxIntegerType = (aValue, bValue, cValue) -> {
            Integer maxNumber = aValue;
            if (maxNumber < bValue) maxNumber = bValue;
            if (maxNumber < cValue) maxNumber = cValue;
            return maxNumber;
        };

        int integerMax = maxIntegerType.MaxMinObj(5, 7, 3);
        System.out.println("Maximum of three integer numbers: " + integerMax);

        MaxMinFrom3Number<Integer> minIntegerType;
        minIntegerType = (aValue, bValue, cValue) -> {
            Integer minNumber = aValue;
            if (minNumber > bValue) minNumber = bValue;
            if (minNumber > cValue) minNumber = cValue;
            return minNumber;
        };

        int integerMin = minIntegerType.MaxMinObj(5, 7, 3);
        System.out.println("Minimum of three integer numbers: " + integerMin);
// Long
        MaxMinFrom3Number<Long> maxLongType;
        maxLongType = (aValue, bValue, cValue) -> {
            Long maxNumber = aValue;
            if (maxNumber < bValue) maxNumber = bValue;
            if (maxNumber < cValue) maxNumber = cValue;
            return maxNumber;
        };

        long longMax = maxLongType.MaxMinObj(5L, 7L, 3L);
        System.out.println("Maximum of three long numbers: " + longMax);

        MaxMinFrom3Number<Long> minLongType;
        minLongType = (aValue, bValue, cValue) -> {
            Long minNumber = aValue;
            if (minNumber > bValue) minNumber = bValue;
            if (minNumber > cValue) minNumber = cValue;
            return minNumber;
        };

        long longMin = minLongType.MaxMinObj(5L, 7L, 3L);
        System.out.println("Minimum of three long numbers: " + longMin);
// Float
        MaxMinFrom3Number<Float> maxFloatType;
        maxFloatType = (aValue, bValue, cValue) -> {
            Float maxNumber = aValue;
            if (maxNumber < bValue) maxNumber = bValue;
            if (maxNumber < cValue) maxNumber = cValue;
            return maxNumber;
        };

        Float floatMax = maxFloatType.MaxMinObj(5F, 7F, 3F);
        System.out.println("Maximum of three float numbers: " + floatMax);

        MaxMinFrom3Number<Float> minFloatType;
        minFloatType = (aValue, bValue, cValue) -> {
            Float minNumber = aValue;
            if (minNumber > bValue) minNumber = bValue;
            if (minNumber > cValue) minNumber = cValue;
            return minNumber;
        };

        Float floatMin = minFloatType.MaxMinObj(5F, 7F, 3F);
        System.out.println("Minimum of three float numbers: " + floatMin);
// Double
        MaxMinFrom3Number<Double> maxDoubleType;
        maxDoubleType = (aValue, bValue, cValue) -> {
            Double maxNumber = aValue;
            if (maxNumber < bValue) maxNumber = bValue;
            if (maxNumber < cValue) maxNumber = cValue;
            return maxNumber;
        };

        Double doubleMax = maxDoubleType.MaxMinObj(5D, 7D, 3D);
        System.out.println("Maximum of three double numbers: " + doubleMax);

        MaxMinFrom3Number<Double> minDoubleType;
        minDoubleType = (aValue, bValue, cValue) -> {
            Double minNumber = aValue;
            if (minNumber > bValue) minNumber = bValue;
            if (minNumber > cValue) minNumber = cValue;
            return minNumber;
        };

        Double doubleMin = minDoubleType.MaxMinObj(5D, 7D, 3D);
        System.out.println("Minimum of three double numbers: " + doubleMin);
// Character
        MaxMinFrom3Number<Character> maxCharacterType;
        maxCharacterType = (aValue, bValue, cValue) -> {
            Character maxChar = aValue;
            if (maxChar < bValue) maxChar = bValue;
            if (maxChar < cValue) maxChar = cValue;
            return maxChar;
        };

        Character charMax = maxCharacterType.MaxMinObj('a', 'b', 'c');
        System.out.println("Maximum of three character numbers: " + charMax);

        MaxMinFrom3Number<Character> minCharacterType;
        minCharacterType = (aValue, bValue, cValue) -> {
            Character minChar = aValue;
            if (minChar > bValue) minChar = bValue;
            if (minChar > cValue) minChar = cValue;
            return minChar;
        };

        Character charMin = minCharacterType.MaxMinObj('a', 'b', 'c');
        System.out.println("Minimum of three character numbers: " + charMin);
// String
        MaxMinFrom3Number<String> maxStringType;
        maxStringType = (aValue, bValue, cValue) -> {
            ArrayList<String> list = new ArrayList<>();
            list.add(aValue);
            list.add(bValue);
            list.add(cValue);
            Collections.sort(list);
            return list.get(0);
        };
        String stringMax = maxStringType.MaxMinObj("fdgfdgf", "kkikiuk", "dewrfegre");
        System.out.println("Maximum of three String numbers: " + stringMax);

        MaxMinFrom3Number<String> minStringType;
        minStringType = (aValue, bValue, cValue) -> {
            ArrayList<String> list = new ArrayList<>();
            list.add(aValue);
            list.add(bValue);
            list.add(cValue);
            Collections.sort(list);
            return list.get(list.size() - 1);
        };
        String stringMin = minStringType.MaxMinObj("aaa", "bbb", "ccc");
        System.out.println("Maximum of three String numbers: " + stringMin);
    }

    public interface MaxMinFrom3Number<T> {
        T MaxMinObj(T aValue, T bValue, T cValue);
    }
}
