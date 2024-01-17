package com.xworkz.collections.lambdarunner;

import com.xworkz.collections.comparabledto.ThreadDTO;
import com.xworkz.collections.comparabledto.ThreadDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadRunner {
    public static void main(String[] args) {
        ThreadDTO threadDTO=new ThreadDTO(15,"Metrics thread",102);
        ThreadDTO threadDTO1=new ThreadDTO(17,"Buttress  thread",60);
        ThreadDTO threadDTO2=new ThreadDTO(25,"Square thread",356);
        ThreadDTO threadDTO3=new ThreadDTO(45,"Straigth thread",789);
        ThreadDTO threadDTO4=new ThreadDTO(35,"NPT thread",200);

        List<ThreadDTO> list=new ArrayList<>();
        list.add(threadDTO);
        list.add(threadDTO1);
        list.add(threadDTO2);
        list.add(threadDTO3);
        list.add(threadDTO4);

        System.out.println("Default Ascending order based on cost..");
        Collections.sort(list);
        for (ThreadDTO r:list
        ) {
            System.out.println(r);
        }

        System.out.println("Ascending order based on type..");
        Collections.sort(list,((o1, o2) -> {return  String.CASE_INSENSITIVE_ORDER.compare(o1.getType(),o2.getType());}));
        for (ThreadDTO r:list
        ) {
            System.out.println(r);
        }

        System.out.println("Ascending order based on length..");
        Collections.sort(list,((o1, o2) -> {return  Double.compare(o1.getLength(),o2.getLength());}));
        for (ThreadDTO r:list
        ) {
            System.out.println(r);
        }

        System.out.println("Descending order based on length..");
        Collections.sort(list,((o1, o2) -> {return  Double.compare(o2.getLength(),o1.getLength());}));
        for (ThreadDTO r:list
        ) {
            System.out.println(r);
        }
        System.out.println("Descending order based on type..");
        Collections.sort(list,((o1, o2) -> {return  String.CASE_INSENSITIVE_ORDER.compare(o2.getType(),o1.getType());}));
        for (ThreadDTO r:list
        ) {
            System.out.println(r);
        }

        System.out.println("Descending order based on cost..");
        Collections.sort(list,((o1, o2) -> {return  Double.compare(o2.getCost(),o1.getCost());}));
        for (ThreadDTO r:list
        ) {
            System.out.println(r);
        }
    }
}
