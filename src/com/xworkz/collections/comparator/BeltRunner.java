package com.xworkz.collections.comparator;

import com.xworkz.collections.comparator.*;
import com.xworkz.collections.standardDTO.BeltDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeltRunner {
    public static void main(String[] args) {
        BeltDTO beltDTO = new BeltDTO("Flat belt  ",100,1,"Black");
        BeltDTO beltDTO1 = new BeltDTO("Timing belt ",300,3,"Brown");
        BeltDTO beltDTO2 = new BeltDTO("Round belt ",600,6,"Gray");
        BeltDTO beltDTO3 = new BeltDTO("Link belt ",200,2,"Light black");
        BeltDTO beltDTO4 = new BeltDTO("V-belt",400,4,"Dark gray");

        List<BeltDTO> list = new ArrayList<>();
        list.add(beltDTO);
        list.add(beltDTO1);
        list.add(beltDTO2);
        list.add(beltDTO3);
        list.add(beltDTO4);

        System.out.println("Ascending order based on Quantity..");
        Comparator<BeltDTO> comparator = new BeltComparatorQuantity();
        Collections.sort(list, comparator);
        for (BeltDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Ascending order based on Cost..");
        Comparator<BeltDTO> comparator1 = new BeltComparator();
        Collections.sort(list, comparator1);
        for (BeltDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("======================================================================== ");
        System.out.println("Ascending order based on Type..");
        Comparator<BeltDTO> comparator2 = new BeltComparatorType();
        Collections.sort(list, comparator2);
        for (BeltDTO type : list
        ) {
            System.out.println(type);
        }
        System.out.println("======================================================================== ");
        System.out.println("Ascending order based on Color..");
        Comparator<BeltDTO> comparator3= new BeltComparatorColor();
        Collections.sort(list, comparator3);
        for (BeltDTO color : list
        ) {
            System.out.println(color);
        }
        System.out.println("======================================================================== ");
        System.out.println("All are in descending order...");
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on Quantity..");
        Comparator<BeltDTO> comparator4 = new BeltComparatorQuantityDesc();
        Collections.sort(list, comparator4);
        for (BeltDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Descending order based on Cost..");
        Comparator<BeltDTO> comparator5 = new BeltComparatorCostDesc();
        Collections.sort(list, comparator5);
        for (BeltDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("========================================================================");

        System.out.println("Descending order based on Type..");
        Comparator<BeltDTO> comparator6 = new BeltComparatorTypeDesc();
        Collections.sort(list, comparator6);
        for (BeltDTO type : list
        ) {
            System.out.println(type);
        }
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on Color..");
        Comparator<BeltDTO> comparator7= new BeltComparatorColorDesc();
        Collections.sort(list, comparator7);
        for (BeltDTO color : list
        ) {
            System.out.println(color);
        }
    }
}
