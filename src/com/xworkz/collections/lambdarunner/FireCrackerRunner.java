package com.xworkz.collections.lambdarunner;

import com.xworkz.collections.comparabledto.FireCrackerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FireCrackerRunner {
    public static void main(String[] args) {
        FireCrackerDTO fireCrackerDTO=new FireCrackerDTO(45,"Petrol","Brown");
        FireCrackerDTO fireCrackerDTO1=new FireCrackerDTO(46,"Carosin","Blue");
        FireCrackerDTO fireCrackerDTO2=new FireCrackerDTO(44,"Diesel","Purple");
        FireCrackerDTO fireCrackerDTO3=new FireCrackerDTO(47,"Petrol1 A","Dark brown");
        FireCrackerDTO fireCrackerDTO4=new FireCrackerDTO(41,"Oil","Black");

        List<FireCrackerDTO> list=new ArrayList<>();
        list.add(fireCrackerDTO);
        list.add(fireCrackerDTO1);
        list.add(fireCrackerDTO2);
        list.add(fireCrackerDTO3);
        list.add(fireCrackerDTO4);

        System.out.println("Default Ascending order based on Heat..");
        Collections.sort(list);
        for (FireCrackerDTO f:list
             ) {
            System.out.println(f);
        }

        System.out.println("Ascending order based on Fuel..");
        Collections.sort(list,((o1, o2)->o1.getFuel().compareTo(o2.getFuel()) ));
        for (FireCrackerDTO f:list
        ) {
            System.out.println(f);
        }

        System.out.println("Ascending order based on Color..");
        Collections.sort(list,((o1, o2) ->o1.getColor().compareTo(o2.getColor())));
        for (FireCrackerDTO f:list
        ) {
            System.out.println(f);
        }
        System.out.println("Descending order based on Heat..");
        Collections.sort(list,((o1, o2) -> Double.compare(o2.getHeat(),o1.getHeat())));
        for (FireCrackerDTO f:list
        ) {
            System.out.println(f);
        }

        System.out.println("Descending order based on Fuel..");
        Collections.sort(list,((o1, o2) ->o2.getFuel().compareTo(o1.getFuel())));
        for (FireCrackerDTO f:list
        ) {
            System.out.println(f);
        }

        System.out.println("Descending order based on Color..");
        Collections.sort(list,((o1, o2) -> o2.getColor().compareTo(o1.getColor())));
        for (FireCrackerDTO f:list
        ) {
            System.out.println(f);
        }
    }
}
