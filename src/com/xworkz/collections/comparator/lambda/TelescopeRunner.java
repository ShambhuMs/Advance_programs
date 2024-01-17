package com.xworkz.collections.comparator.lambda;


import com.xworkz.collections.standardDTO.TelescopeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TelescopeRunner {
    public static void main(String[] args) {
        TelescopeDTO telescopeDTO=new TelescopeDTO(48,1,100890);
        TelescopeDTO telescopeDTO1=new TelescopeDTO(200,20,1450000);
        TelescopeDTO telescopeDTO2=new TelescopeDTO(64,3,160000);
        TelescopeDTO telescopeDTO3=new TelescopeDTO(100,10,2007200);
        TelescopeDTO telescopeDTO4=new TelescopeDTO(50,2,100400);

        List<TelescopeDTO> list=new ArrayList<>();
        list.add(telescopeDTO);
        list.add(telescopeDTO1);
        list.add(telescopeDTO2);
        list.add(telescopeDTO3);
        list.add(telescopeDTO4);

        System.out.println("Ascending order based on Lens...");
        Comparator<TelescopeDTO> comparator=(l1, l2)->{
            return  Double.compare(l1.getLens(), l2.getLens());
        };
        Collections.sort(list,comparator);
        for (TelescopeDTO lens:list
        ) {
            System.out.println(lens);
        }

        System.out.println("Ascending order based on Cost...");
        Comparator<TelescopeDTO> comparator1=(c1, c2)->{
            return  Double.compare(c1.getCost(), c2.getCost());
        };
        Collections.sort(list,comparator1);
        for (TelescopeDTO cost:list
        ) {
            System.out.println(cost);
        }

        System.out.println("Ascending order based on Distance...");
        Comparator<TelescopeDTO> comparator2=(d1, d2)->{
            return  Integer.compare(d1.getDistance(),d2.getDistance());
        };
        Collections.sort(list,comparator2);
        for (TelescopeDTO distance:list
        ) {
            System.out.println(distance);
        }
//  All are in Descending order
        System.out.println("Descending order based on Lens...");
        Comparator<TelescopeDTO> comparator3=(l1, l2)->{
            return  Double.compare(l2.getLens(), l1.getLens());
        };
        Collections.sort(list,comparator3);
        for (TelescopeDTO lens:list
        ) {
            System.out.println(lens);
        }

        System.out.println("Descending order based on Cost...");
        Comparator<TelescopeDTO> comparator4=(c1, c2)->{
            return  Double.compare(c2.getCost(), c1.getCost());
        };
        Collections.sort(list,comparator4);
        for (TelescopeDTO cost:list
        ) {
            System.out.println(cost);
        }

        System.out.println("Descending order based on Distance...");
        Comparator<TelescopeDTO> comparator5=(d1, d2)->{
            return  Integer.compare(d2.getDistance(),d1.getDistance());
        };
        Collections.sort(list,comparator5);
        for (TelescopeDTO distance:list
        ) {
            System.out.println(distance);
        }

    }
}
