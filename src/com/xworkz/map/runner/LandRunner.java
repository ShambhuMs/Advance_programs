package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LandRunner {
    public static void main(String[] args) {
        Map<String,String> landOwnerMap=new HashMap<>();
        landOwnerMap.put("Bengaluru","Ravi");
        landOwnerMap.put("Sirsi","Shambhu");
        landOwnerMap.put("Davnagere","Anil");
        landOwnerMap.put("Udupi","Sushan");
        landOwnerMap.put("Mangaluru","Dinesh");

        System.out.println("=============================");
        System.out.println("...All Land Names...");
        Set<String> set1=landOwnerMap.keySet();
        set1.forEach(System.out::println);
        System.out.println("...Owners Name...");
        landOwnerMap.values().forEach(System.out::println);
    }
}
