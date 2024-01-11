package com.xworkz.collections.comparator.lambda;

import com.xworkz.collections.standardDTO.ShipDTO;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShipRunner {
    public static void main(String[] args) {
        ShipDTO shipDTO=new ShipDTO("Black pearl","Passenger",10000000,50000);
        ShipDTO shipDTO1=new ShipDTO("Knot working","Goods",60000000,55000);
        ShipDTO shipDTO2=new ShipDTO("Aquaholic","Naval ship ",50000000,65000);
        ShipDTO shipDTO3=new ShipDTO("Graceful dancer","Submarin",40000000,75000);
        ShipDTO shipDTO4=new ShipDTO("Sapphire","Fishing ship",20000000,80000);

        List<ShipDTO> list=new ArrayList<>();
        list.add(shipDTO);
        list.add(shipDTO1);
        list.add(shipDTO2);
        list.add(shipDTO3);
        list.add(shipDTO4);

        System.out.println("Ascending order based on Name...");
        Comparator<ShipDTO> comparator=(n1, n2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(n1.getName(), n2.getName());
        };
        Collections.sort(list,comparator);
        for (ShipDTO name:list
        ) {
            System.out.println(name);
        }

        System.out.println("Ascending order based on Type...");
        Comparator<ShipDTO> comparator1=(t1,t2)->{
            return  String.CASE_INSENSITIVE_ORDER.compare(t1.getType(), t2.getType());
        };
        Collections.sort(list,comparator1);
        for (ShipDTO type:list
        ) {
            System.out.println(type);
        }

        System.out.println("Ascending order based on Cost...");
        Comparator<ShipDTO> comparator2=(c1,c2)->{
            return  Double.compare(c1.getCost(), c2.getCost());
        };
        Collections.sort(list,comparator2);
        for (ShipDTO cost:list
        ) {
            System.out.println(cost);
        }
        System.out.println("Ascending order based on Capacity...");
        Comparator<ShipDTO> comparator3=(cap1,cap2)->{
            return Long.compare(cap1.getCapacity(), cap2.getCapacity());
        };
        Collections.sort(list,comparator3);
        for (ShipDTO capacity:list
        ) {
            System.out.println(capacity);
        }
        // All are in Descending order
        System.out.println("Descending order based on Name...");
        Comparator<ShipDTO> comparator4=(n1, n2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(n2.getName(), n1.getName());
        };
        Collections.sort(list,comparator4);
        for (ShipDTO name:list
        ) {
            System.out.println(name);
        }

        System.out.println("Descending order based on Type...");
        Comparator<ShipDTO> comparator5=(t1,t2)->{
            return  String.CASE_INSENSITIVE_ORDER.compare(t2.getType(), t1.getType());
        };
        Collections.sort(list,comparator5);
        for (ShipDTO type:list
        ) {
            System.out.println(type);
        }

        System.out.println("Descending order based on Cost...");
        Comparator<ShipDTO> comparator6=(c1,c2)->{
            return  Double.compare(c2.getCost(), c1.getCost());
        };
        Collections.sort(list,comparator6);
        for (ShipDTO cost:list
        ) {
            System.out.println(cost);
        }
        System.out.println("Descending order based on Capacity...");
        Comparator<ShipDTO> comparator7=(cap1,cap2)->{
            return Long.compare(cap2.getCapacity(), cap1.getCapacity());
        };
        Collections.sort(list,comparator7);
        for (ShipDTO capacity:list
        ) {
            System.out.println(capacity);
        }
    }
}
