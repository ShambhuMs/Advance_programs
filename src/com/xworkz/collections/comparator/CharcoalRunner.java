package com.xworkz.collections.comparator;

import com.xworkz.collections.comparator.*;
import com.xworkz.collections.standardDTO.CharcoalDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CharcoalRunner {
    public static void main(String[] args) {
        CharcoalDTO charcoalDTO = new CharcoalDTO("Lump charcoal,",100,1);
        CharcoalDTO charcoalDTO1 = new CharcoalDTO("Charcoal briquettes", 400, 4);
        CharcoalDTO charcoalDTO2 = new CharcoalDTO("Hardwood briquettes",  200, 2);
        CharcoalDTO charcoalDTO3 = new CharcoalDTO("Binchotan", 500, 5);
        CharcoalDTO charcoalDTO4 = new CharcoalDTO("Coconut shell charcoal",300, 3);

        List<CharcoalDTO> list = new ArrayList<>();
        list.add(charcoalDTO);
        list.add(charcoalDTO1);
        list.add(charcoalDTO2);
        list.add(charcoalDTO3);
        list.add(charcoalDTO4);

        System.out.println("Ascending order based on quantity..");
        Comparator<CharcoalDTO> comparator = new CharcoalComparator();
        Collections.sort(list, comparator);
        for (CharcoalDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Ascending order based on Cost..");
        Comparator<CharcoalDTO> comparator1 = new CharcoalComparatorCost();
        Collections.sort(list, comparator1);
        for (CharcoalDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("======================================================================== ");
        System.out.println("Ascending order based on Type..");
        Comparator<CharcoalDTO> comparator3 = new CharcoalComparatorType();
        Collections.sort(list, comparator3);
        for (CharcoalDTO type : list
        ) {
            System.out.println(type);
        }
        System.out.println("======================================================================== ");
        System.out.println("All are in descending order...");
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on quantity..");
        Comparator<CharcoalDTO> comparator4 = new CharcoalComparatorQuantityDesc();
        Collections.sort(list, comparator4);
        for (CharcoalDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Descending order based on Cost..");
        Comparator<CharcoalDTO> comparator5 = new CharcoalComparatorCostDesc();
        Collections.sort(list, comparator5);
        for (CharcoalDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("========================================================================");

        System.out.println("Descending order based on Type..");
        Comparator<CharcoalDTO> comparator7 = new CharcoalComparatorTypeDesc();

        Collections.sort(list, comparator7);
        for (CharcoalDTO type : list
        ) {
            System.out.println(type);
        }
    }
    }

