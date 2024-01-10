package com.xworkz.collections.comparator;

import com.xworkz.collections.comparator.*;
import com.xworkz.collections.standardDTO.PaperDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaperRunner {
    public static void main(String[] args) {
        PaperDTO paperDTO=new PaperDTO(1,"Copy paper",1.0,1);
        PaperDTO paperDTO1=new PaperDTO(2,"Bond paper",10,2);
        PaperDTO paperDTO2=new PaperDTO(3,"News paper",6,1);
        PaperDTO paperDTO3=new  PaperDTO(4,"Tissue paper",2,4);
        PaperDTO paperDTO4=new PaperDTO(5,"Glossy paper",20.0,3);

        List<PaperDTO> list=new ArrayList<>();
        list.add(paperDTO);
        list.add(paperDTO1);
        list.add(paperDTO2);
        list.add(paperDTO3);
        list.add(paperDTO4);
        System.out.println("Ascending oreder based on Cost......");
        Comparator<PaperDTO> comparator=new PaperComparatorCost();
        Collections.sort(list,comparator);
        for (PaperDTO cost:list
             ) {
            System.out.println(cost);
        }
        System.out.println("==============================================");
        System.out.println("Ascending oreder based on quantity......");
        Comparator<PaperDTO> comparator1=new PaperComparatorQuantity();
        Collections.sort(list,comparator1);
        for (PaperDTO quantity:list
        ) {
            System.out.println(quantity);
        }
        System.out.println("==============================================");
        System.out.println("Ascending oreder based on type......");
        Comparator<PaperDTO> comparator2=new PaperComparatorType();
        Collections.sort(list,comparator2);
        for (PaperDTO type:list
        ) {
            System.out.println(type);
        }
        System.out.println("==============================================");
        System.out.println("Ascending oreder based on quantity......");
        Comparator<PaperDTO> comparator3=new PaperComparatorSmoothness();
        Collections.sort(list,comparator3);
        for (PaperDTO smoothness:list
        ) {
            System.out.println(smoothness);
        }
        System.out.println("==============================================");
        System.out.println("All are in desc order");
        System.out.println("==============================================");
        System.out.println("Descending oreder based on Cost......");
        Comparator<PaperDTO> comparator4=new PaperComparatorCostDesc();
        Collections.sort(list,comparator4);
        for (PaperDTO cost:list
        ) {
            System.out.println(cost);
        }
        System.out.println("Descending oreder based on quantity......");
        Comparator<PaperDTO> comparator5=new PaperComparatorQuantityDesc();
        Collections.sort(list,comparator5);
        for (PaperDTO quantity:list
        ) {
            System.out.println(quantity);
        }
        System.out.println("==============================================");
        System.out.println("Descending oreder based on type......");
        Comparator<PaperDTO> comparator6=new PaperComparatorTypeDesc();
        Collections.sort(list,comparator6);
        for (PaperDTO type:list
        ) {
            System.out.println(type);
        }
        System.out.println("==============================================");
        System.out.println("Descending oreder based on quantity......");
        Comparator<PaperDTO> comparator7=new PaperComparatorSmoothnessDesc();
        Collections.sort(list,comparator7);
        for (PaperDTO smoothness:list
        ) {
            System.out.println(smoothness);
        }
    }
}
