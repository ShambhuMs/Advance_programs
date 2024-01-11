package com.xworkz.collections.comparator.lambda;

import com.xworkz.collections.standardDTO.StreetDTO;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreetRunner {
    public static void main(String[] args) {
        StreetDTO streetDTO=new StreetDTO("NS palya",10,100,"Balaji");
        StreetDTO streetDTO1=new StreetDTO("Micro layout",20,250,"Kiran");
        StreetDTO streetDTO2=new StreetDTO("Church Street",30,300,"Ambur");
        StreetDTO streetDTO3=new StreetDTO("Brigade",15,150,"Prasanna");
        StreetDTO streetDTO4=new StreetDTO("Dollars street",16,160,"Namaste");

        List<StreetDTO> list=new ArrayList<>();
        list.add(streetDTO);
        list.add(streetDTO1);
        list.add(streetDTO2);
        list.add(streetDTO3);
        list.add(streetDTO4);

        System.out.println("Ascending order based on StreetName...");
        Comparator<StreetDTO> comparator=(s1, s2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(s1.getStreetName(), s2.getStreetName());
        };
        Collections.sort(list,comparator);
        for (StreetDTO s:list
        ) {
            System.out.println(s);
        }

        System.out.println("Ascending order based on NoOfShop...");
        Comparator<StreetDTO> comparator1=(c1, c2)->{
            return  Integer.compare(c1.getNoOfShop(), c2.getNoOfShop());
        };
        Collections.sort(list,comparator1);
        for (StreetDTO no:list
        ) {
            System.out.println(no);
        }

        System.out.println("Ascending order based on Length...");
        Comparator<StreetDTO> comparator2=(q1,q2)->{
            return  Double.compare(q1.getLength(), q2.getLength());
        };
        Collections.sort(list,comparator2);
        for (StreetDTO length:list
        ) {
            System.out.println(length);
        }
        System.out.println("Ascending order based on ShopName...");
        Comparator<StreetDTO> comparator3=(s1, s2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(s1.getShopName(), s2.getShopName());
        };
        Collections.sort(list,comparator3);
        for (StreetDTO s:list
        ) {
            System.out.println(s);
        }
        //All are in Descending order
        System.out.println("Descending order based on StreetName...");
        Comparator<StreetDTO> comparator4=(s1, s2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(s2.getStreetName(), s1.getStreetName());
        };
        Collections.sort(list,comparator4);
        for (StreetDTO s:list
        ) {
            System.out.println(s);
        }

        System.out.println("Descending order based on NoOfShop...");
        Comparator<StreetDTO> comparator5=(c1, c2)->{
            return  Integer.compare(c2.getNoOfShop(), c1.getNoOfShop());
        };
        Collections.sort(list,comparator5);
        for (StreetDTO no:list
        ) {
            System.out.println(no);
        }

        System.out.println("Descending order based on Length...");
        Comparator<StreetDTO> comparator6=(q1,q2)->{
            return  Double.compare(q2.getLength(), q1.getLength());
        };
        Collections.sort(list,comparator6);
        for (StreetDTO length:list
        ) {
            System.out.println(length);
        }
        System.out.println("Descending order based on ShopName...");
        Comparator<StreetDTO> comparator7=(s1, s2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(s2.getShopName(), s1.getShopName());
        };
        Collections.sort(list,comparator7);
        for (StreetDTO s:list
        ) {
            System.out.println(s);
        }
    }
}
