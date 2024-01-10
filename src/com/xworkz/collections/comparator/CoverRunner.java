package com.xworkz.collections.comparator;

import com.xworkz.collections.comparator.*;
import com.xworkz.collections.standardDTO.CoverDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoverRunner {
    public static void main(String[] args) {
        CoverDTO coverDTO = new CoverDTO("Polycarbonate  ",10,"White",1.2);
        CoverDTO coverDTO1 = new CoverDTO("Polypropylene ",6,"Black",1.3);
        CoverDTO coverDTO2 = new CoverDTO("Polyethylene ",9,"Blue",1.6);
        CoverDTO coverDTO3 = new CoverDTO("Acrylonitrile-Butadiene-Styrene ",8,"Gold",2.0);
        CoverDTO coverDTO4 = new CoverDTO("Polyvinyl Chloride  ",15,"Light Green",2.2);

        List<CoverDTO> list = new ArrayList<>();
        list.add(coverDTO);
        list.add(coverDTO1);
        list.add(coverDTO2);
        list.add(coverDTO3);
        list.add(coverDTO4);

        System.out.println("Ascending order based on Size..");
        Comparator<CoverDTO> comparator = new CoverComparator();
        Collections.sort(list, comparator);
        for (CoverDTO size : list
        ) {
            System.out.println(size);
        }
        System.out.println("=========================================================================");
        System.out.println("Ascending order based on Cost..");
        Comparator<CoverDTO> comparator1 = new CoverComparatorCost();
        Collections.sort(list, comparator1);
        for (CoverDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("======================================================================== ");
        System.out.println("Ascending order based on Type..");
        Comparator<CoverDTO> comparator2 = new CoverComparatorType();
        Collections.sort(list, comparator2);
        for (CoverDTO type : list
        ) {
            System.out.println(type);
        }
        System.out.println("======================================================================== ");
        System.out.println("Ascending order based on Color..");
        Comparator<CoverDTO> comparator3= new CoverComparatorColor();
        Collections.sort(list, comparator3);
        for (CoverDTO color : list
        ) {
            System.out.println(color);
        }
        System.out.println("======================================================================== ");
        System.out.println("All are in descending order...");
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on Size..");
        Comparator<CoverDTO> comparator4 = new CoverComparatorSizeDesc();
        Collections.sort(list, comparator4);
        for (CoverDTO size : list
        ) {
            System.out.println(size);
        }
        System.out.println("=========================================================================");
        System.out.println("Descending order based on Cost..");
        Comparator<CoverDTO> comparator5 = new CoverComparatorCostDesc();
        Collections.sort(list, comparator5);
        for (CoverDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("========================================================================");

        System.out.println("Descending order based on Type..");
        Comparator<CoverDTO> comparator6 = new CoverComparatorTypeDesc();

        Collections.sort(list, comparator6);
        for (CoverDTO type : list
        ) {
            System.out.println(type);
        }
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on Color..");
        Comparator<CoverDTO> comparator7= new CoverComparatorColorDesc();
        Collections.sort(list, comparator7);
        for (CoverDTO color : list
        ) {
            System.out.println(color);
        }
    }
}
