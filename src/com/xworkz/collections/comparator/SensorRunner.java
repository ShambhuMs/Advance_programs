package com.xworkz.collections.comparator;

import com.xworkz.collections.comparator.*;
import com.xworkz.collections.standardDTO.SensorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SensorRunner {
    public static void main(String[] args) {
        SensorDTO sensor=new SensorDTO("Position sensor","Infrared",500,1);
        SensorDTO sensor1=new SensorDTO("Pressure sensor","Temperature",1000,2);
        SensorDTO sensor2=new SensorDTO("Force sensor","Radar",1500,3);
        SensorDTO sensor3=new SensorDTO("Vibration sensor","Mobile",2000,4);
        SensorDTO sensor4=new SensorDTO("Fluid Sensor","Radio",2500,5);

        List<SensorDTO> list=new ArrayList<>();
        list.add(sensor);
        list.add(sensor1);
        list.add(sensor2);
        list.add(sensor3);
        list.add(sensor4);
        for (SensorDTO a:list
        ) {
            System.out.println(a);
        }
        System.out.println("=================================================================");
        System.out.println("Ascending order based on Cost");
        Comparator<SensorDTO> comparator=new SensorComparator();
        Collections.sort(list,comparator);
        for (SensorDTO c:list
             ) {
            System.out.println(c);
        }
        System.out.println("==========================================================================");

        System.out.println("=================================================================");
        System.out.println("Ascending order based on Distance");
        Comparator<SensorDTO> comparator1=new SensorComparatorDistance();
        Collections.sort(list,comparator1);
        for (SensorDTO d:list
        ) {
            System.out.println(d);
        }
        System.out.println("==========================================================================");
        System.out.println("Ascending order based on Type");
        Comparator<SensorDTO> comparator2=new SensorComparatorType();
        Collections.sort(list,comparator2);
        for (SensorDTO type:list
        ) {
            System.out.println(type);
        }
        System.out.println("==========================================================================");
        System.out.println("Ascending order based on Name");
        Comparator<SensorDTO> comparator3=new SensorComparatorName();
        Collections.sort(list,comparator3);
        for (SensorDTO name:list
        ) {
            System.out.println(name);
        }
        System.out.println("========================================================================");
        System.out.println("All are in desc order.....");
        System.out.println("========================================================================");
        System.out.println("Desc order based on Cost....");
        Comparator<SensorDTO> compare=new SensorComparatorCostDesc();
        Collections.sort(list,compare);
        for (SensorDTO i:list
             ) {
            System.out.println(i);
        }
        System.out.println("========================================================================");
        System.out.println("Desc order based on Distance....");
        Comparator<SensorDTO> compare1=new SensorComparatorDistanceDesc();
        Collections.sort(list,compare1);
        for (SensorDTO dis:list
        ) {
            System.out.println(dis);
        }
        System.out.println("========================================================================");
        System.out.println("Desc order based on Type....");
        Comparator<SensorDTO> compare2=new SensorComparatorTypeDesc();
        Collections.sort(list,compare2);
        for (SensorDTO type:list
        ) {
            System.out.println(type);
        }
        System.out.println("========================================================================");
        System.out.println("Desc order based on Name....");
        Comparator<SensorDTO> compare3=new SensorComparatorNameDesc();
        Collections.sort(list,compare3);
        for (SensorDTO name:list
        ) {
            System.out.println(name);
        }
    }
}
