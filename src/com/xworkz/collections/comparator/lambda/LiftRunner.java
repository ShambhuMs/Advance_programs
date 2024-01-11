package com.xworkz.collections.comparator.lambda;


import com.xworkz.collections.standardDTO.LiftDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LiftRunner {
    public static void main(String[] args) {
        LiftDTO liftDTO=new LiftDTO(20000,800,8,5);
        LiftDTO liftDTO1=new LiftDTO(24000,850,9,4);
        LiftDTO liftDTO2=new LiftDTO(25000,810,7,6);
        LiftDTO liftDTO3=new LiftDTO(27000,830,11,8);
        LiftDTO liftDTO4=new LiftDTO(21000,820,6,9);

        List<LiftDTO> list=new ArrayList<>();
        list.add(liftDTO);
        list.add(liftDTO1);
        list.add(liftDTO2);
        list.add(liftDTO3);
        list.add(liftDTO4);

        System.out.println("Ascending order based on Capacity...");
        Comparator<LiftDTO> comparator=(cap1, cap2)->{
            return  Double.compare(cap1.getCapacity(), cap2.getCapacity());
        };
        Collections.sort(list,comparator);
        for (LiftDTO cap:list
        ) {
            System.out.println(cap);
        }
        System.out.println("Ascending order based on MaxWeight...");
        Comparator<LiftDTO> comparator1=(max1, max2)->{
            return  Double.compare(max1.getMaxWeight(), max2.getMaxWeight());
        };
        Collections.sort(list,comparator1);
        for (LiftDTO max:list
        ) {
            System.out.println(max);
        }
        System.out.println("Ascending order based on MaxPerson...");
        Comparator<LiftDTO> comparator2=(max1, max2)->{
            return  Double.compare(max1.getMaxPerson(), max2.getMaxPerson());
        };
        Collections.sort(list,comparator2);
        for (LiftDTO max:list
        ) {
            System.out.println(max);
        }
        System.out.println("Ascending order based on NoOfFloor...");
        Comparator<LiftDTO> comparator3=(no1, no2)->{
            return  Double.compare(no1.getNoOfFloor(),no2.getNoOfFloor());
        };
        Collections.sort(list,comparator3);
        for (LiftDTO no:list
        ) {
            System.out.println(no);
        }
        // All are in Descending order
        System.out.println("Descending order based on Capacity...");
        Comparator<LiftDTO> comparator4=(cap1, cap2)->{
            return  Double.compare(cap1.getCapacity(), cap2.getCapacity());
        };
        Collections.sort(list,comparator4);
        for (LiftDTO cap:list
        ) {
            System.out.println(cap);
        }
        System.out.println("Descending order based on MaxWeight...");
        Comparator<LiftDTO> comparator5=(max1, max2)->{
            return  Double.compare(max2.getMaxWeight(), max1.getMaxWeight());
        };
        Collections.sort(list,comparator5);
        for (LiftDTO max:list
        ) {
            System.out.println(max);
        }
        System.out.println("Descending order based on MaxPerson...");
        Comparator<LiftDTO> comparator6=(max1, max2)->{
            return  Double.compare(max2.getMaxPerson(), max1.getMaxPerson());
        };
        Collections.sort(list,comparator6);
        for (LiftDTO max:list
        ) {
            System.out.println(max);
        }
        System.out.println("Descending order based on NoOfFloor...");
        Comparator<LiftDTO> comparator7=(no1, no2)->{
            return  Double.compare(no2.getNoOfFloor(),no1.getNoOfFloor());
        };
        Collections.sort(list,comparator7);
        for (LiftDTO no:list
        ) {
            System.out.println(no);
        }
    }
}
