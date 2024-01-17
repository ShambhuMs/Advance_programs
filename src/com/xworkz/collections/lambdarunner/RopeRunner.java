package com.xworkz.collections.lambdarunner;

import com.xworkz.collections.comparabledto.RopeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RopeRunner {
    public static void main(String[] args) {
        RopeDTO ropeDTO=new RopeDTO(50,"Cotton rope",150);
        RopeDTO ropeDTO1=new RopeDTO(40,"Nylon rope",350);
        RopeDTO ropeDTO2=new RopeDTO(60,"Polystere rope",850);
        RopeDTO ropeDTO3=new RopeDTO(80,"Manila rope",450);
        RopeDTO ropeDTO4=new RopeDTO(70,"Jute rope",250);

        List<RopeDTO> list=new ArrayList<>();
        list.add(ropeDTO);
        list.add(ropeDTO1);
        list.add(ropeDTO2);
        list.add(ropeDTO3);
        list.add(ropeDTO4);

        System.out.println("Default Ascending order based on length..");
        Collections.sort(list);
        for (RopeDTO r:list
             ) {
            System.out.println(r);
        }

        System.out.println("Ascending order based on type..");
        Collections.sort(list,((o1, o2) -> {return  String.CASE_INSENSITIVE_ORDER.compare(o1.getType(),o2.getType());}));
        for (RopeDTO r:list
        ) {
            System.out.println(r);
        }

        System.out.println("Ascending order based on cost..");
        Collections.sort(list,((o1, o2) -> {return  Double.compare(o1.getCost(),o2.getCost());}));
        for (RopeDTO r:list
        ) {
            System.out.println(r);
        }

        System.out.println("Descending order based on length..");
        Collections.sort(list,((o1, o2) -> {return  Double.compare(o2.getLength(),o1.getLength());}));
        for (RopeDTO r:list
        ) {
            System.out.println(r);
        }
        System.out.println("Descending order based on type..");
        Collections.sort(list,((o1, o2) -> {return  String.CASE_INSENSITIVE_ORDER.compare(o2.getType(),o1.getType());}));
        for (RopeDTO r:list
        ) {
            System.out.println(r);
        }

        System.out.println("Descending order based on cost..");
        Collections.sort(list,((o1, o2) -> {return  Double.compare(o2.getCost(),o1.getCost());}));
        for (RopeDTO r:list
        ) {
            System.out.println(r);
        }
    }
}
