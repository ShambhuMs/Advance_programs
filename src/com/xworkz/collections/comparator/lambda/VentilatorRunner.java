package com.xworkz.collections.comparator.lambda;

import com.xworkz.collections.standardDTO.VentilatorDTO;
import com.xworkz.collections.standardDTO.VentilatorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VentilatorRunner {
    public static void main(String[] args) {
        VentilatorDTO ventilatorDTO=new VentilatorDTO(3,29.1,560000,86);
        VentilatorDTO ventilatorDTO1=new VentilatorDTO(2,27.4,590000,88);
        VentilatorDTO ventilatorDTO2=new VentilatorDTO(1,39.1,550000,89);
        VentilatorDTO ventilatorDTO3=new VentilatorDTO(5,29.5,580000,87);
        VentilatorDTO ventilatorDTO4=new VentilatorDTO(4,35.1,570000,85);

        List<VentilatorDTO> list=new ArrayList<>();
        list.add(ventilatorDTO);
        list.add(ventilatorDTO1);
        list.add(ventilatorDTO2);
        list.add(ventilatorDTO3);
        list.add(ventilatorDTO4);

        System.out.println("Ascending order based on OxygenPoint...");
        Comparator<VentilatorDTO> comparator=(o1, o2)->{
            return Integer.compare(o1.getOxygenPoint(), o2.getOxygenPoint());
        };
        Collections.sort(list,comparator);
        for (VentilatorDTO oxy:list
        ) {
            System.out.println(oxy);
        }

        System.out.println("Ascending order based on Temperature...");
        Comparator<VentilatorDTO> comparator1=(t1,t2)->{
            return  Double.compare(t1.getTemperature(),t2.getTemperature());
        };
        Collections.sort(list,comparator1);
        for (VentilatorDTO temp:list
        ) {
            System.out.println(temp);
        }

        System.out.println("Ascending order based on tensileStrength...");
        Comparator<VentilatorDTO> comparator2=(ten1,ten2)->{
            return  Double.compare(ten1.getTensileStrength(), ten2.getTensileStrength());
        };
        Collections.sort(list,comparator2);
        for (VentilatorDTO tens:list
        ) {
            System.out.println(tens);
        }

        System.out.println("Ascending order based on Hardness...");
        Comparator<VentilatorDTO> comparator3=(h1,h2)->{
            return Integer.compare(h1.getHardness(), h2.getHardness());
        };
        Collections.sort(list,comparator3);
        for (VentilatorDTO hard:list
        ) {
            System.out.println(hard);
        }

        //        All are in descending order.....
        System.out.println("Descending order based on OxygenPoint...");
        Comparator<VentilatorDTO> comparator4=(o1, o2)->{
            return Integer.compare(o2.getOxygenPoint(), o1.getOxygenPoint());
        };
        Collections.sort(list,comparator4);
        for (VentilatorDTO oxy:list
        ) {
            System.out.println(oxy);
        }

        System.out.println("Descending order based on Temperature...");
        Comparator<VentilatorDTO> comparator5=(t1,t2)->{
            return  Double.compare(t2.getTemperature(),t1.getTemperature());
        };
        Collections.sort(list,comparator5);
        for (VentilatorDTO temp:list
        ) {
            System.out.println(temp);
        }

        System.out.println("Descending order based on tensileStrength...");
        Comparator<VentilatorDTO> comparator6=(ten1,ten2)->{
            return  Double.compare(ten2.getTensileStrength(), ten1.getTensileStrength());
        };
        Collections.sort(list,comparator6);
        for (VentilatorDTO tens:list
        ) {
            System.out.println(tens);
        }

        System.out.println("Descending order based on Hardness...");
        Comparator<VentilatorDTO> comparator7=(h1,h2)->{
            return Integer.compare(h2.getHardness(), h1.getHardness());
        };
        Collections.sort(list,comparator7);
        for (VentilatorDTO hard:list
        ) {
            System.out.println(hard);
        }
    }
}
