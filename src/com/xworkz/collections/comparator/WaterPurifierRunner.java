package com.xworkz.collections.comparator;

import com.xworkz.collections.comparator.*;
import com.xworkz.collections.standardDTO.WaterPurifierDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaterPurifierRunner {
    public static void main(String[] args) {
        WaterPurifierDTO waterPurifierDTO = new WaterPurifierDTO("Astor", 1000, 5000, 2);
        WaterPurifierDTO waterPurifierDTO1 = new WaterPurifierDTO("Aquaguard", 1500, 5500, 1);
        WaterPurifierDTO waterPurifierDTO2 = new WaterPurifierDTO("Kinly", 3000, 6000, 3);
        WaterPurifierDTO waterPurifierDTO3 = new WaterPurifierDTO("kent", 2500, 6500, 5);
        WaterPurifierDTO waterPurifierDTO4 = new WaterPurifierDTO("W5", 2000, 7000, 4);

        List<WaterPurifierDTO> list = new ArrayList<>();
        list.add(waterPurifierDTO);
        list.add(waterPurifierDTO1);
        list.add(waterPurifierDTO2);
        list.add(waterPurifierDTO3);
        list.add(waterPurifierDTO4);

        System.out.println("Ascending order based on quantity..");
        Comparator<WaterPurifierDTO> comparator = new WaterPurifierComparator();
        Collections.sort(list, comparator);
        for (WaterPurifierDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Ascending order based on Cost..");
        Comparator<WaterPurifierDTO> comparator1 = new WaterPurifierComparatorCost();
        Collections.sort(list, comparator1);
        for (WaterPurifierDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("========================================================================");
        System.out.println("Ascending order based on Brand..");
        Comparator<WaterPurifierDTO> comparator2 = new WaterPurifierComparatorBrand();
        Collections.sort(list, comparator2);
        for (WaterPurifierDTO brand : list
        ) {
            System.out.println(brand);
        }
        System.out.println("======================================================================== ");
        System.out.println("Ascending order based on Warranty..");
        Comparator<WaterPurifierDTO> comparator3 = new WaterPurifierComparatorWarranty();
        Collections.sort(list, comparator3);
        for (WaterPurifierDTO warranty : list
        ) {
            System.out.println(warranty);
        }
        System.out.println("======================================================================== ");
        System.out.println("All are in descending order...");
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on quantity..");
        Comparator<WaterPurifierDTO> comparator4 = new WaterPurifierComparatorQuantityDesc();
        Collections.sort(list, comparator4);
        for (WaterPurifierDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Descending order based on Cost..");
        Comparator<WaterPurifierDTO> comparator5 = new WaterPurifierComparatorCostDesc();
        Collections.sort(list, comparator5);
        for (WaterPurifierDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("========================================================================");
        System.out.println("Descending order based on Brand..");
        Comparator<WaterPurifierDTO> comparator6 = new WaterPurifierComparatoBrandrDesc();
        Collections.sort(list, comparator6);
        for (WaterPurifierDTO brand : list
        ) {
            System.out.println(brand);
        }
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on Warranty..");
        Comparator<WaterPurifierDTO> comparator7 = new WaterPurifierComparatorWarrantyDesc();
        Collections.sort(list, comparator7);
        for (WaterPurifierDTO warranty : list
        ) {
            System.out.println(warranty);
        }
    }
}
