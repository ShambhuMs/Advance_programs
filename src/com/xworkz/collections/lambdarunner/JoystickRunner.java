package com.xworkz.collections.lambdarunner;

import com.xworkz.collections.comparabledto.JoystickDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JoystickRunner {
    public static void main(String[] args) {
        JoystickDTO JoystickDTO=new JoystickDTO("Black",100,1);
        JoystickDTO JoystickDTO1=new JoystickDTO("White",200,3);
        JoystickDTO JoystickDTO2=new JoystickDTO("Pink",1500,4);
        JoystickDTO JoystickDTO3=new JoystickDTO("Red",1000,10);
        JoystickDTO JoystickDTO4=new JoystickDTO("Gray",700,6);

        List<JoystickDTO> list=new ArrayList<>();
        list.add(JoystickDTO);
        list.add(JoystickDTO1);
        list.add(JoystickDTO2);
        list.add(JoystickDTO3);
        list.add(JoystickDTO4);

        System.out.println("Default Ascending order based on Cost....");
        Collections.sort(list);
        for (JoystickDTO o:list
        ) {
            System.out.println(o);
        }

        System.out.println(" Ascending order based on Brand....");
        Collections.sort(list,((o1, o2) -> o1.getBrand().compareTo(o2.getBrand()) ));
        for (JoystickDTO c:list
        ) {
            System.out.println(c);
        }

        System.out.println(" Ascending order based on Warranty....");
        Collections.sort(list,((o1, o2) -> Integer.compare(o1.getWarranty(), o2.getWarranty()) ));
        for (JoystickDTO c:list
        ) {
            System.out.println(c);
        }
        System.out.println("Descending order based on Brand..");
        Collections.sort(list,((o1, o2) -> o2.getBrand().compareTo(o1.getBrand())));
        for (JoystickDTO c:list
        ) {
            System.out.println(c);
        }
        System.out.println(" Descending order based on Cost....");
        Collections.sort(list,((o1, o2) -> Double.compare(o2.getCost(), o1.getCost()) ));
        for (JoystickDTO c:list
        ) {
            System.out.println(c);
        }

        System.out.println(" Descending order based on Warranty....");
        Collections.sort(list,((o1, o2) -> Integer.compare(o2.getWarranty(), o1.getWarranty()) ));
        for (JoystickDTO c:list
        ) {
            System.out.println(c);
        }
    }
}
