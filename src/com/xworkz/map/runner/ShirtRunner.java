package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShirtRunner {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Denim Shirt","Richlook");
        map.put("Linen Shirt","RedTape");
        map.put("Solid Shirt","Peter England");
        map.put("Polo Shirt","Zodiac");
        map.put("Flannel Shirt","Levi's");
        System.out.println("All Keys....");
        Set<String> set= map.keySet();
        set.forEach(System.out::println);
        System.out.println("All values...");
        map.values().forEach(System.out::println);
    }
}
