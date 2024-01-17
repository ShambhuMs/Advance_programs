package com.xworkz.collections.lambdarunner;



import com.xworkz.collections.comparabledto.NeedleDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NeedleRunner {
    public static void main(String[] args) {
        NeedleDTO needleDTO=new NeedleDTO(12,0.13);
        NeedleDTO needleDTO1=new NeedleDTO(13,0.15);
        NeedleDTO needleDTO2=new NeedleDTO(11,0.12);
        NeedleDTO needleDTO3=new NeedleDTO(15,0.17);
        NeedleDTO needleDTO4=new NeedleDTO(14,0.16);

        List<NeedleDTO> list=new ArrayList<>();
        list.add(needleDTO);
        list.add(needleDTO1);
        list.add(needleDTO2);
        list.add(needleDTO3);
        list.add(needleDTO4);

        System.out.println("Default Ascending order based on Length....");
        Collections.sort(list);
        for (NeedleDTO o:list
        ) {
            System.out.println(o);
        }

        System.out.println("Ascending order based on weight....");
        Collections.sort(list,((o1, o2) -> Double.compare(o1.getWeight(), o2.getWeight()) ));
        for (NeedleDTO c:list
        ) {
            System.out.println(c);
        }

        System.out.println("Descending order based on Length....");
        Collections.sort(list,((o1, o2) ->Double.compare(o2.getLength(), o1.getLength()) ));
        for (NeedleDTO c:list
        ) {
            System.out.println(c);
        }

        System.out.println("Descending order based on Weight....");
        Collections.sort(list,((o1, o2) -> Double.compare(o2.getWeight(), o1.getWeight()) ));
        for (NeedleDTO c:list
        ) {
            System.out.println(c);
        }

    }
}
