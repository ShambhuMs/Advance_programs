package com.xworkz.collections.comparator.lambda;

import com.xworkz.collections.standardDTO.GeyserDTO;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GeyserRunner {
    public static void main(String[] args) {
        GeyserDTO GeyserDTO=new GeyserDTO("Philips",3,12000,1500.0);
        GeyserDTO ventilatorDTO1=new GeyserDTO("Butterfly",4,16000,1800);
        GeyserDTO ventilatorDTO2=new GeyserDTO("Godrej",2,8000,1600);
        GeyserDTO ventilatorDTO3=new GeyserDTO("Samsung",5,20000,1400);
        GeyserDTO ventilatorDTO4=new GeyserDTO("Bajaj",1,4000,1700);

        List<GeyserDTO> list=new ArrayList<>();
        list.add(GeyserDTO);
        list.add(ventilatorDTO1);
        list.add(ventilatorDTO2);
        list.add(ventilatorDTO3);
        list.add(ventilatorDTO4);

        System.out.println("Ascending order based on Brand...");
        Comparator<GeyserDTO> comparator=(b1, b2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(b1.getBrand(), b2.getBrand());
        };
        Collections.sort(list,comparator);
        for (GeyserDTO brand:list
        ) {
            System.out.println(brand);
        }

        System.out.println("Ascending order based on Quantity...");
        Comparator<GeyserDTO> comparator1=(q1,q2)->{
            return  Integer.compare(q1.getQuantity(), q2.getQuantity());
        };
        Collections.sort(list,comparator1);
        for (GeyserDTO quantity:list
        ) {
            System.out.println(quantity);
        }

        System.out.println("Ascending order based on Cost...");
        Comparator<GeyserDTO> comparator2=(c1,c2)->{
            return  Double.compare(c1.getCost(), c2.getCost());
        };
        Collections.sort(list,comparator2);
        for (GeyserDTO cost:list
        ) {
            System.out.println(cost);
        }

        System.out.println("Ascending order based on Capacity...");
        Comparator<GeyserDTO> comparator3=(cap1,cap2)->{
            return Double.compare(cap1.getCapacity(), cap2.getCapacity());
        };
        Collections.sort(list,comparator3);
        for (GeyserDTO capacity:list
        ) {
            System.out.println(capacity);
        }
//      All are in Descending order
        System.out.println("Descending order based on Brand...");
        Comparator<GeyserDTO> comparator4=(b1, b2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(b2.getBrand(), b1.getBrand());
        };
        Collections.sort(list,comparator4);
        for (GeyserDTO brand:list
        ) {
            System.out.println(brand);
        }

        System.out.println("Descending order based on Quantity...");
        Comparator<GeyserDTO> comparator5=(q1,q2)->{
            return  Integer.compare(q2.getQuantity(), q1.getQuantity());
        };
        Collections.sort(list,comparator5);
        for (GeyserDTO quantity:list
        ) {
            System.out.println(quantity);
        }

        System.out.println("Descending order based on Cost...");
        Comparator<GeyserDTO> comparator6=(c1,c2)->{
            return  Double.compare(c2.getCost(), c1.getCost());
        };
        Collections.sort(list,comparator6);
        for (GeyserDTO cost:list
        ) {
            System.out.println(cost);
        }

        System.out.println("Descending order based on Capacity...");
        Comparator<GeyserDTO> comparator7=(cap1,cap2)->{
            return Double.compare(cap2.getCapacity(), cap1.getCapacity());
        };
        Collections.sort(list,comparator7);
        for (GeyserDTO capacity:list
        ) {
            System.out.println(capacity);
        }
    }
}
