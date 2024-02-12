package com.xworkz.collection.runner;

import com.xworkz.collection.dto.DiseaseDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiseaseRunner {
    public static void main(String[] args) {
        DiseaseDTO diseaseDTO=new DiseaseDTO("Fever",200,3);
        DiseaseDTO diseaseDTO1=new DiseaseDTO("Cold",150,2);
        DiseaseDTO diseaseDTO2=new DiseaseDTO("KidneyStone",20000,50);
        DiseaseDTO diseaseDTO3=new DiseaseDTO("Cancer",150000,100);
        DiseaseDTO diseaseDTO4=new DiseaseDTO("Braintumer",500000,200);
        List<DiseaseDTO> list=new ArrayList<>();
        list.add(diseaseDTO);
        list.add(diseaseDTO1);
        list.add(diseaseDTO2);
        list.add(diseaseDTO3);
        list.add(diseaseDTO4);
        System.out.println("default sort...");
        Collections.sort(list);
        list.forEach(p-> System.out.println(p));

        System.out.println("Ascending order based on Name");
        Collections.sort(list,(o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName()));
        list.forEach(o-> System.out.println(o));
        System.out.println("Descending order based on Name");
        Collections.sort(list,(o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2.getName(), o1.getName()));
        list.forEach(o-> System.out.println(o));

        System.out.println("Ascending order based on Cost");
        Collections.sort(list,(o1, o2) ->Double.compare(o1.getTreatmentCost(), o2.getTreatmentCost()));
        list.forEach(o-> System.out.println(o));
        System.out.println("Descending order based on Cost");
        Collections.sort(list,(o1, o2) -> Double.compare(o2.getTreatmentCost(), o1.getTreatmentCost()));
        list.forEach(o-> System.out.println(o));
    }
}
