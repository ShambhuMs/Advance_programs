package com.xworkz.collections.comparator.lambda;

import com.xworkz.collections.standardDTO.SkywalkDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SkywalkRunner {
    public static void main(String[] args) {
        SkywalkDTO skywalkDTO=new SkywalkDTO("Skywalk5",100,200,1);
        SkywalkDTO skywalkDTO1=new SkywalkDTO("Skywalk2",200,500,3);
        SkywalkDTO skywalkDTO2=new SkywalkDTO("Skywalk3",300,350,5);
        SkywalkDTO skywalkDTO3=new SkywalkDTO("Skywalk1",250,150,2);
        SkywalkDTO skywalkDTO4=new SkywalkDTO("Skywalk4",150,250,4);

        List<SkywalkDTO> list=new ArrayList<>();
        list.add(skywalkDTO);
        list.add(skywalkDTO1);
        list.add(skywalkDTO2);
        list.add(skywalkDTO3);
        list.add(skywalkDTO4);

        System.out.println("Ascending order based on Name...");
        Comparator<SkywalkDTO> comparator=(c1,c2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(c1.getName(),c2.getName());
        };
        Collections.sort(list,comparator);
        for (SkywalkDTO name:list
             ) {
            System.out.println(name);
        }

        System.out.println("Ascending order based on height...");
        Comparator<SkywalkDTO> comparator1=(h1,h2)->{
            return  Double.compare(h1.getHeight(),h2.getHeight());
        };
        Collections.sort(list,comparator1);
        for (SkywalkDTO height:list
             ) {
            System.out.println(height);
        }

        System.out.println("Ascending order based on Length...");
        Comparator<SkywalkDTO> comparator2=(l1,l2)->{
            return  Double.compare(l1.getLength(),l2.getLength());
        };
        Collections.sort(list,comparator2);
        for (SkywalkDTO length:list
        ) {
            System.out.println(length);
        }

        System.out.println("Ascending order based on No...");
        Comparator<SkywalkDTO> comparator3=(n1,n2)->{
            return Integer.compare(n1.getNo(),n2.getNo());
        };
        Collections.sort(list,comparator3);
        for (SkywalkDTO no:list
        ) {
            System.out.println(no);
        }

    //        All are in descending order.....
        System.out.println("Descending order based on Name...");
        Comparator<SkywalkDTO> comparator4=(c1,c2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(c2.getName(),c1.getName());
        };
        Collections.sort(list,comparator4);
        for (SkywalkDTO name:list
        ) {
            System.out.println(name);
        }

        System.out.println("Descending order based on height...");
        Comparator<SkywalkDTO> comparator5=(h1,h2)->{
            return  Double.compare(h2.getHeight(), h1.getHeight());
        };
        Collections.sort(list,comparator5);
        for (SkywalkDTO height:list
        ) {
            System.out.println(height);
        }

        System.out.println("Descending order based on Length...");
        Comparator<SkywalkDTO> comparator6=(l1,l2)->{
            return  Double.compare(l2.getLength(), l1.getLength());
        };
        Collections.sort(list,comparator6);
        for (SkywalkDTO length:list
        ) {
            System.out.println(length);
        }

        System.out.println("Descending order based on No...");
        Comparator<SkywalkDTO> comparator7=(n1,n2)->{
            return  Integer.compare(n2.getNo(),n1.getNo());
        };
        Collections.sort(list,comparator7);
        for (SkywalkDTO no:list
        ) {
            System.out.println(no);
        }


    }
}
