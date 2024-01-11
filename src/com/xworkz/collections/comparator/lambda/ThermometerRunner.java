package com.xworkz.collections.comparator.lambda;

import com.xworkz.collections.standardDTO.ThermometerDTO;
import com.xworkz.collections.standardDTO.ThermometerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThermometerRunner {
    public static void main(String[] args) {
        ThermometerDTO thermometerDTO=new ThermometerDTO(100,1200);
        ThermometerDTO thermometerDTO1=new ThermometerDTO(130,1250);
        ThermometerDTO thermometerDTO2=new ThermometerDTO(120,1400);
        ThermometerDTO thermometerDTO3=new ThermometerDTO(110,1350);
        ThermometerDTO thermometerDTO4=new ThermometerDTO(140,1300);

        List<ThermometerDTO> list=new ArrayList<>();
        list.add(thermometerDTO);
        list.add(thermometerDTO1);
        list.add(thermometerDTO2);
        list.add(thermometerDTO3);
        list.add(thermometerDTO4);

        System.out.println("Ascending order based on Capacity...");
        Comparator<ThermometerDTO> comparator=(cap1, cap2)->{
            return  Double.compare(cap1.getCapacity(), cap2.getCapacity());
        };
        Collections.sort(list,comparator);
        for (ThermometerDTO cap:list
        ) {
            System.out.println(cap);
        }

        System.out.println("Ascending order based on Cost...");
        Comparator<ThermometerDTO> comparator1=(c1, c2)->{
            return  Double.compare(c1.getCost(), c2.getCost());
        };
        Collections.sort(list,comparator1);
        for (ThermometerDTO cost:list
        ) {
            System.out.println(cost);
        }
        // All are in Descending order..
        System.out.println("Descending order based on Capacity...");
        Comparator<ThermometerDTO> comparator2=(cap1, cap2)->{
            return  Double.compare(cap2.getCapacity(), cap1.getCapacity());
        };
        Collections.sort(list,comparator2);
        for (ThermometerDTO cap:list
        ) {
            System.out.println(cap);
        }

        System.out.println("Descending order based on Cost...");
        Comparator<ThermometerDTO> comparator3=(c1, c2)->{
            return  Double.compare(c2.getCost(), c1.getCost());
        };
        Collections.sort(list,comparator3);
        for (ThermometerDTO cost:list
        ) {
            System.out.println(cost);
        }
    }
}
