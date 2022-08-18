package com.company.practice.ObjectOrientedProgramming.Collections.Examples.Tests;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

//        TreeMap<Integer, String> testTreeMap = new TreeMap<>();
//        testTreeMap.put(1, "aaa");
//        testTreeMap.put(2, "bbb");
//        testTreeMap.put(3, "ccc");
//        testTreeMap.put(4, "ddd");
//        testTreeMap.put(5, "eee");
//
//        testTreeMap.entrySet().forEach(System.out::println);
//        System.out.println(testTreeMap.size());
//
//        testTreeMap.put(1, "fff");
//        testTreeMap.put(1, "ggg");
//        testTreeMap.entrySet().forEach(System.out::println);

        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "abc1");
        map.put(2, "abc2");
        map.put(3, "abc3");

        ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());
        for(int i=keys.size()-1; i>=0;i--){
            System.out.println(map.get(keys.get(i)));
        }

    }
}
