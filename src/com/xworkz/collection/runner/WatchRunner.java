package com.xworkz.collection.runner;

import com.xworkz.collection.dto.WatchDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WatchRunner {
    public static void main(String[] args) {
        WatchDTO watchDTO=new WatchDTO("Apple",2,15000,"Digital");
        WatchDTO watchDTO1=new WatchDTO("Samsung",3,16000,"Digital");
        WatchDTO watchDTO2=new WatchDTO("Realme",1,1500,"Normal");
        WatchDTO watchDTO3=new WatchDTO("Fastrack",1,2500,"Smartwatch");
        WatchDTO watchDTO4=new WatchDTO("Redme",4,3500,"Smartwatch");

        List<WatchDTO> list=new ArrayList<>();
        list.add(watchDTO);
        list.add(watchDTO1);
        list.add(watchDTO2);
        list.add(watchDTO3);
        list.add(watchDTO4);
        Collections.sort(list);
        System.out.println("Default sort...");
        list.forEach((o1)-> System.out.println(o1));
//        for (WatchDTO w:list
//             ) {
//            System.out.println(w);
//        }
        System.out.println("Ascending order based on cost");
        Collections.sort(list,((o1, o2) ->Double.compare(o1.getCost(), o2.getCost())));
        list.forEach(p-> System.out.println(p));
        System.out.println("Descending order based on cost");
        Collections.sort(list,(o1,o2)->Double.compare(o2.getCost(),o1.getCost()));
        list.forEach(p-> System.out.println(p));

        System.out.println("Ascending order based on brand");
        Collections.sort(list,(o1,o2)->String.CASE_INSENSITIVE_ORDER.compare(o1.getBrand(), o2.getBrand()));
        list.forEach(p-> System.out.println(p));
        System.out.println("Descending order based on brand");
        Collections.sort(list,(o1,o2)->String.CASE_INSENSITIVE_ORDER.compare(o2.getBrand(),o1.getBrand()));
        list.forEach(p-> System.out.println(p));

        System.out.println("Ascending oredr based on type");
        Collections.sort(list,((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getType(),o2.getType())));
        list.forEach(p-> System.out.println(p));
        System.out.println("Descending oredr based on type");
        Collections.sort(list,((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2.getType(),o1.getType())));
        list.forEach(p-> System.out.println(p));
    }
}
