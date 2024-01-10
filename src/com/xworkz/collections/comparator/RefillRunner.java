package com.xworkz.collections.comparator;

import com.xworkz.collections.comparator.*;
import com.xworkz.collections.standardDTO.RefillDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RefillRunner {
    public static void main(String[] args) {
        RefillDTO speakerDTO = new RefillDTO(3, 1000, "Type3", "Refill1");
        RefillDTO speakerDTO1 = new RefillDTO(4, 1500, "Type4", "Refill2");
        RefillDTO speakerDTO2 = new RefillDTO(2, 3000, "Type5", "Refill3");
        RefillDTO speakerDTO3 = new RefillDTO(5, 2500, "Type1", "Refill4");
        RefillDTO speakerDTO4 = new RefillDTO(1, 2000, "Type2", "Refill5");

        List<RefillDTO> list = new ArrayList<>();
        list.add(speakerDTO);
        list.add(speakerDTO1);
        list.add(speakerDTO2);
        list.add(speakerDTO3);
        list.add(speakerDTO4);

        System.out.println("Ascending order based on quantity..");
        Comparator<RefillDTO> comparator = new RefillComparator();
        Collections.sort(list, comparator);
        for (RefillDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Ascending order based on Cost..");
        Comparator<RefillDTO> comparator1 = new RefillComparatorCost();
        Collections.sort(list, comparator1);
        for (RefillDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("========================================================================");
        System.out.println("Ascending order based on Brand..");
        Comparator<RefillDTO> comparator2 = new RefillComparatorBrand();
        Collections.sort(list, comparator2);
        for (RefillDTO brand : list
        ) {
            System.out.println(brand);
        }
        System.out.println("======================================================================== ");
        System.out.println("Ascending order based on Type..");
        Comparator<RefillDTO> comparator3 = new RefillComparatorType();
        Collections.sort(list, comparator3);
        for (RefillDTO type : list
        ) {
            System.out.println(type);
        }
        System.out.println("======================================================================== ");
        System.out.println("All are in descending order...");
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on quantity..");
        Comparator<RefillDTO> comparator4 = new RefillComparatorQuantityDesc();
        Collections.sort(list, comparator4);
        for (RefillDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Descending order based on Cost..");
        Comparator<RefillDTO> comparator5 = new RefillComparatorCostDesc();
        Collections.sort(list, comparator5);
        for (RefillDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("========================================================================");
        System.out.println("Descending order based on Brand..");
        Comparator<RefillDTO> comparator6 = new RefillComparatorBrandDesc();
        Collections.sort(list, comparator6);
        for (RefillDTO brand : list
        ) {
            System.out.println(brand);
        }
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on Type..");
        Comparator<RefillDTO> comparator7 = new RefillComparatorTypeDesc();
        Collections.sort(list, comparator7);
        for (RefillDTO type : list
        ) {
            System.out.println(type);
        }
    }
}
