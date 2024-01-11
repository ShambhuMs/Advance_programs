package com.xworkz.collections.comparator.lambda;

import com.xworkz.collections.standardDTO.RadioDTO;
import com.xworkz.collections.standardDTO.RadioDTO;
import com.xworkz.collections.standardDTO.RadioDTO;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RadioRunner {
    public static void main(String[] args) {
        RadioDTO radioDTO=new RadioDTO("Philips",500,1,4.2);
        RadioDTO radioDTO1=new RadioDTO("Realme",1500,3,4.5);
        RadioDTO radioDTO2=new RadioDTO("Redme",1000,2,4.1);
        RadioDTO radioDTO3=new RadioDTO("Samsung",2500,5,4.4);
        RadioDTO radioDTO4=new RadioDTO("Radio 1.2",2000,4,4.3);

        List<RadioDTO> list=new ArrayList<>();
        list.add(radioDTO);
        list.add(radioDTO1);
        list.add(radioDTO2);
        list.add(radioDTO3);
        list.add(radioDTO4);


        System.out.println("Ascending order based on Brand...");
        Comparator<RadioDTO> comparator=(b1, b2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(b1.getBrand(), b2.getBrand());
        };
        Collections.sort(list,comparator);
        for (RadioDTO brand:list
        ) {
            System.out.println(brand);
        }

        System.out.println("Ascending order based on Cost...");
        Comparator<RadioDTO> comparator1=(c1, c2)->{
            return  Double.compare(c1.getCost(), c2.getCost());
        };
        Collections.sort(list,comparator1);
        for (RadioDTO cost:list
        ) {
            System.out.println(cost);
        }

        System.out.println("Ascending order based on Quantity...");
        Comparator<RadioDTO> comparator2=(q1, q2)->{
            return  Integer.compare(q1.getQuantity(), q2.getQuantity());
        };
        Collections.sort(list,comparator2);
        for (RadioDTO quantity:list
        ) {
            System.out.println(quantity);
        }
        System.out.println("Ascending order based on Ratings...");
        Comparator<RadioDTO> comparator3=(r1, r2)->{
            return  Double.compare(r1.getRating(), r2.getRating());
        };
        Collections.sort(list,comparator3);
        for (RadioDTO rating:list
        ) {
            System.out.println(rating);
        }
//      All are in Descending order..
        System.out.println("Descending order based on Brand...");
        Comparator<RadioDTO> comparator4=(b1, b2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(b2.getBrand(), b1.getBrand());
        };
        Collections.sort(list,comparator4);
        for (RadioDTO brand:list
        ) {
            System.out.println(brand);
        }

        System.out.println("Descending order based on Cost...");
        Comparator<RadioDTO> comparator5=(c1, c2)->{
            return  Double.compare(c2.getCost(), c1.getCost());
        };
        Collections.sort(list,comparator5);
        for (RadioDTO cost:list
        ) {
            System.out.println(cost);
        }

        System.out.println("Descending order based on Quantity...");
        Comparator<RadioDTO> comparator6=(q1, q2)->{
            return  Integer.compare(q2.getQuantity(), q1.getQuantity());
        };
        Collections.sort(list,comparator6);
        for (RadioDTO quantity:list
        ) {
            System.out.println(quantity);
        }
        System.out.println("Descending order based on Ratings...");
        Comparator<RadioDTO> comparator7=(r1, r2)->{
            return  Double.compare(r2.getRating(), r1.getRating());
        };
        Collections.sort(list,comparator7);
        for (RadioDTO rating:list
        ) {
            System.out.println(rating);
        }

    }
}
