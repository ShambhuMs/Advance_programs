package com.xworkz.collections.lambdarunner;

import com.xworkz.collections.comparabledto.AlarmDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlarmRunner {
    public static void main(String[] args) {
        AlarmDTO alarmDTO=new AlarmDTO("System alarm",1,10000);
        AlarmDTO alarmDTO1=new AlarmDTO("Burglar alarms",4,50000);
        AlarmDTO alarmDTO2=new AlarmDTO("Bells",3,40000);
        AlarmDTO alarmDTO3=new AlarmDTO("Water Alarm",5,70000);
        AlarmDTO alarmDTO4=new AlarmDTO("Motion sensors",2,20000);

        List<AlarmDTO> list=new ArrayList<>();
        list.add(alarmDTO);
        list.add(alarmDTO1);
        list.add(alarmDTO2);
        list.add(alarmDTO3);
        list.add(alarmDTO4);

        System.out.println("Default Ascending order based on Quantity..");
        Collections.sort(list);
        for (AlarmDTO a:list
        ) {
            System.out.println(a);
        }

        System.out.println("Ascending order based on Cost.....");
       Collections.sort(list,(a1,a2)-> Double.compare(a1.getCost(),a2.getCost()));

       for (AlarmDTO a:list
             ) {
            System.out.println(a);
        }

        System.out.println("Ascending order based on Type.....");
        Collections.sort(list,(a1,a2)->a1.getType().compareTo(a2.getType()));
        for (AlarmDTO a:list
        ) {
            System.out.println(a);
        }

        System.out.println("Descending order based on Quantity.....");
        Collections.sort(list,(a1,a2)-> Double.compare(a2.getQuantity(),a1.getQuantity()));

        for (AlarmDTO a:list
        ) {
            System.out.println(a);
        }

        System.out.println("Descending order based on Cost.....");
        Collections.sort(list,(a1,a2)-> Double.compare(a2.getCost(),a1.getCost()));
        for (AlarmDTO a:list
        ) {
            System.out.println(a);
        }

        System.out.println("Descending order based on Type.....");
        Collections.sort(list,(a1,a2)-> a2.getType().compareTo(a1.getType()));
            for (AlarmDTO a : list
            ) {
                System.out.println(a);
            }


        }
}
