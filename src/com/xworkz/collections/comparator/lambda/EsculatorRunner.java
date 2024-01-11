package com.xworkz.collections.comparator.lambda;

import com.xworkz.collections.standardDTO.EsculatorDTO;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EsculatorRunner {
    public static void main(String[] args) {
        EsculatorDTO esculatorDTO=new EsculatorDTO(20,1000,1.0,60);
        EsculatorDTO esculatorDTO1=new EsculatorDTO(25,1200,1.4,63);
        EsculatorDTO esculatorDTO2=new EsculatorDTO(23,1500,1.3,64);
        EsculatorDTO esculatorDTO3=new EsculatorDTO(24,1300,1.5,62);
        EsculatorDTO esculatorDTO4=new EsculatorDTO(21,1250,1.2,61);

        List<EsculatorDTO> list=new ArrayList<>();
        list.add(esculatorDTO);
        list.add(esculatorDTO1);
        list.add(esculatorDTO2);
        list.add(esculatorDTO3);
        list.add(esculatorDTO4);

        System.out.println("Ascending order based on Capacity...");
        Comparator<EsculatorDTO> comparator=(c1, c2)->{
            return  Double.compare(c1.getCapacity(), c2.getCapacity());
        };
        Collections.sort(list,comparator);
        for (EsculatorDTO cap:list
        ) {
            System.out.println(cap);
        }
        System.out.println("Ascending order based on MaxWeight...");
        Comparator<EsculatorDTO> comparator1=(max1, max2)->{
            return  Double.compare(max1.getMaxWeight(), max2.getMaxWeight());
        };
        Collections.sort(list,comparator1);
        for (EsculatorDTO max:list
        ) {
            System.out.println(max);
        }
        System.out.println("Ascending order based on MinWeight...");
        Comparator<EsculatorDTO> comparator2=(min1, min2)->{
            return  Double.compare(min1.getMinWeight(), min2.getMinWeight());
        };
        Collections.sort(list,comparator2);
        for (EsculatorDTO min:list
        ) {
            System.out.println(min);
        }
        System.out.println("Ascending order based on Length...");
        Comparator<EsculatorDTO> comparator3=(l1, l2)->{
            return  Double.compare(l1.getLength(), l2.getLength());
        };
        Collections.sort(list,comparator3);
        for (EsculatorDTO length:list
        ) {
            System.out.println(length);
        }
        //All are in Descending order..
        System.out.println("Descending order based on Capacity...");
        Comparator<EsculatorDTO> comparator4=(c1, c2)->{
            return  Double.compare(c2.getCapacity(), c1.getCapacity());
        };
        Collections.sort(list,comparator4);
        for (EsculatorDTO cap:list
        ) {
            System.out.println(cap);
        }
        System.out.println("Descending order based on MaxWeight...");
        Comparator<EsculatorDTO> comparator5=(max1, max2)->{
            return  Double.compare(max2.getMaxWeight(), max1.getMaxWeight());
        };
        Collections.sort(list,comparator5);
        for (EsculatorDTO max:list
        ) {
            System.out.println(max);
        }
        System.out.println("Descending order based on MinWeight...");
        Comparator<EsculatorDTO> comparator6=(min1, min2)->{
            return  Double.compare(min2.getMinWeight(), min1.getMinWeight());
        };
        Collections.sort(list,comparator6);
        for (EsculatorDTO min:list
        ) {
            System.out.println(min);
        }
        System.out.println("Descending order based on Length...");
        Comparator<EsculatorDTO> comparator7=(l1, l2)->{
            return  Double.compare(l2.getLength(), l1.getLength());
        };
        Collections.sort(list,comparator7);
        for (EsculatorDTO length:list
        ) {
            System.out.println(length);
        }
    }
}
