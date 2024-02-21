package com.xworkz.map.runner;

import lombok.ToString;

import java.util.*;
@ToString
public class FoodRunner {
    public static void main(String[] args) {
        Map<String,String[]> map=new HashMap<>();
        String[] ingredients={"chilly","onion","garlic","ginger"};
        String[] ingredients1={"Pepper","onion","chilly","ginger"};
        String[] ingredients2={"Red chilly","Kabab powder","onion","garlic","ginger"};
        String[] ingredients3={"chilly","chicken","onion","garlic","ginger"};
        String[] ingredients4={"Rice","onion","garlic","ginger","chilly"};
        map.put("Noodles",ingredients);
        map.put("Egg rice",ingredients1);
        map.put("Ballulli kabab",ingredients2);
        map.put("Chicken chilly",ingredients3);
        map.put("Chicken Rice",ingredients4);
        System.out.println("....All food names.....");
        Set<String> set=map.keySet();
        set.forEach(System.out::println);
        System.out.println("....All ingredients......");
      Collection<String[]> collection= map.values();
     collection.forEach(s->{
         for (String i:s) {
             System.out.println(i);
         }
     });
    }
}
