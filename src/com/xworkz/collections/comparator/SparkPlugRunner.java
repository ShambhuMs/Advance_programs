package com.xworkz.collections.comparator;

import com.xworkz.collections.comparator.*;
import com.xworkz.collections.standardDTO.SparkPlugDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SparkPlugRunner {
    public static void main(String[] args) {
        SparkPlugDTO waterPurifierDTO = new SparkPlugDTO("Iridium","NGK",10000,2);
        SparkPlugDTO waterPurifierDTO1 = new SparkPlugDTO("Platinum", "Champion", 30000, 1);
        SparkPlugDTO waterPurifierDTO2 = new SparkPlugDTO("Copper", "Champion copper plus", 25000, 3);
        SparkPlugDTO waterPurifierDTO3 = new SparkPlugDTO("Silver", "DENSO", 15000, 5);
        SparkPlugDTO waterPurifierDTO4 = new SparkPlugDTO("Automative", "ACDelco", 20000, 4);

        List<SparkPlugDTO> list = new ArrayList<>();
        list.add(waterPurifierDTO);
        list.add(waterPurifierDTO1);
        list.add(waterPurifierDTO2);
        list.add(waterPurifierDTO3);
        list.add(waterPurifierDTO4);

        System.out.println("Ascending order based on quantity..");
        Comparator<SparkPlugDTO> comparator = new SparkPlugComparator();
        Collections.sort(list, comparator);
        for (SparkPlugDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Ascending order based on Cost..");
        Comparator<SparkPlugDTO> comparator1 = new SparkPlugComparatorCost();
        Collections.sort(list, comparator1);
        for (SparkPlugDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("========================================================================");
        System.out.println("Ascending order based on Brand..");
        Comparator<SparkPlugDTO> comparator2 = new SparkPlugComparatorBrand();
        Collections.sort(list, comparator2);
        for (SparkPlugDTO brand : list
        ) {
            System.out.println(brand);
        }
        System.out.println("======================================================================== ");
        System.out.println("Ascending order based on Type..");
        Comparator<SparkPlugDTO> comparator3 = new SparkPlugComparatorType();
        Collections.sort(list, comparator3);
        for (SparkPlugDTO type : list
        ) {
            System.out.println(type);
        }
        System.out.println("======================================================================== ");
        System.out.println("All are in descending order...");
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on quantity..");
        Comparator<SparkPlugDTO> comparator4 = new SparkPlugComparatorQuantityDesc();
        Collections.sort(list, comparator4);
        for (SparkPlugDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Descending order based on Cost..");
        Comparator<SparkPlugDTO> comparator5 = new SparkPlugComparatorCostDesc();
        Collections.sort(list, comparator5);
        for (SparkPlugDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("========================================================================");
        System.out.println("Descending order based on Brand..");
        Comparator<SparkPlugDTO> comparator6 = new SparkPlugComparatorBrandDesc();
        Collections.sort(list, comparator6);
        for (SparkPlugDTO brand : list
        ) {
            System.out.println(brand);
        }
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on Type..");
        Comparator<SparkPlugDTO> comparator7 = new SparkPlugComparatorTypeDesc();
        Collections.sort(list, comparator7);
        for (SparkPlugDTO type : list
        ) {
            System.out.println(type);
        }
    }
}
