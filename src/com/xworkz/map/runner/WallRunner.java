package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WallRunner {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Kitchen wall","Sky blue");
        map.put("Bendroom wall","Grey");
        map.put("Shear wall","Pink");
        map.put("cavity","Black");
        map.put("faced","Brown");
        System.out.println("All wall names....");
        Set<String> set=map.keySet();
        set.forEach(System.out::println);
        System.out.println("All colors....");
        map.values().forEach(System.out::println);
    }
}
