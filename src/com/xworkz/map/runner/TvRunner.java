package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TvRunner {
    public static void main(String[] args) {
        Map<String,String> tvBrandMap=new HashMap<>();
        tvBrandMap.put("LED","Onida");
        tvBrandMap.put("Oled","Samsung");
        tvBrandMap.put("LCD","realme");
        tvBrandMap.put("4K","MI");
        tvBrandMap.put("Plasma","LG");

        System.out.println("=======================");
        System.out.println("...Tv Names..");
        Set<String> set = tvBrandMap.keySet();
        set.forEach(e-> System.out.println(e));
        System.out.println("..Brand Name of All tv..");
        tvBrandMap.values().forEach(System.out::println);
    }
}
