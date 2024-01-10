package com.xworkz.collections.comparator;

import com.xworkz.collections.comparator.*;
import com.xworkz.collections.standardDTO.SpeakerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SpeakerRunner {
    public static void main(String[] args) {
        SpeakerDTO speakerDTO = new SpeakerDTO(3, 1000, "Boat", 2);
        SpeakerDTO speakerDTO1 = new SpeakerDTO(4, 1500, "Zibronics", 1);
        SpeakerDTO speakerDTO2 = new SpeakerDTO(2, 3000, "Philips", 3);
        SpeakerDTO speakerDTO3 = new SpeakerDTO(5, 2500, "Noise", 5);
        SpeakerDTO speakerDTO4 = new SpeakerDTO(1, 2000, "Sony", 4);

        List<SpeakerDTO> list = new ArrayList<>();
        list.add(speakerDTO);
        list.add(speakerDTO1);
        list.add(speakerDTO2);
        list.add(speakerDTO3);
        list.add(speakerDTO4);

        System.out.println("Ascending order based on quantity..");
        Comparator<SpeakerDTO> comparator = new SpeakerComparator();
        Collections.sort(list, comparator);
        for (SpeakerDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Ascending order based on Cost..");
        Comparator<SpeakerDTO> comparator1 = new SpeakerComparatorCost();
        Collections.sort(list, comparator1);
        for (SpeakerDTO cost : list
        ) {
            System.out.println(cost);
        }
         System.out.println("========================================================================");
         System.out.println("Ascending order based on Brand..");
         Comparator<SpeakerDTO> comparator2 = new SpeakerComparatorBrand();
         Collections.sort(list, comparator2);
         for (SpeakerDTO brand : list
         ) {
             System.out.println(brand);
         }
         System.out.println("======================================================================== ");
         System.out.println("Ascending order based on Warranty..");
         Comparator<SpeakerDTO> comparator3 = new SpeakerComparatorWarranty();
         Collections.sort(list, comparator3);
         for (SpeakerDTO warranty : list
         ) {
             System.out.println(warranty);
         }
         System.out.println("======================================================================== ");
         System.out.println("All are in descending order...");
         System.out.println("======================================================================== ");
          System.out.println("Descending order based on quantity..");
          Comparator<SpeakerDTO> comparator4 = new SpeakerComparatorQuantityDesc();
          Collections.sort(list, comparator4);
          for (SpeakerDTO quantity : list
          ) {
              System.out.println(quantity);
          }
          System.out.println("=========================================================================");
          System.out.println("Descending order based on Cost..");
          Comparator<SpeakerDTO> comparator5 = new SpeakerComparatorCostDesc();
          Collections.sort(list, comparator5);
          for (SpeakerDTO cost : list
          ) {
              System.out.println(cost);
          }
           System.out.println("========================================================================");
           System.out.println("Descending order based on Brand..");
           Comparator<SpeakerDTO> comparator6 = new SpeakerComparatorBrandDesc();
           Collections.sort(list, comparator6);
           for (SpeakerDTO brand : list
           ) {
               System.out.println(brand);
           }
           System.out.println("======================================================================== ");
           System.out.println("Descending order based on Warranty..");
           Comparator<SpeakerDTO> comparator7 = new SpeakerComparatorWarrantyDesc();
             Collections.sort(list, comparator7);
            for (SpeakerDTO warranty : list
            ) {
            System.out.println(warranty);
           }


    }
}