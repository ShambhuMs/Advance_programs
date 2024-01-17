package com.xworkz.collections.lambdarunner;

import com.xworkz.collections.comparabledto.WingsDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WingsRunner {
    public static void main(String[] args) {
        WingsDTO wingsDTO=new WingsDTO(342335.0,"Low wing",5);
        WingsDTO wingsDTO1=new WingsDTO(80264538.0,"High wing",3);
        WingsDTO wingsDTO2=new WingsDTO(80264528.0,"Swept wing",4);
        WingsDTO wingsDTO3=new WingsDTO(80264689.0,"Delta wing",2);
        WingsDTO wingsDTO4=new WingsDTO(80264579.0,"Rectangular wing",9);

        List<WingsDTO> list=new ArrayList<>();
        list.add(wingsDTO);
        list.add(wingsDTO1);
        list.add(wingsDTO2);
        list.add(wingsDTO3);
        list.add(wingsDTO4);

        System.out.println("Default Ascending order based on warranty..");
        Collections.sort(list);
        for (WingsDTO w:list
             ) {
            System.out.println(w);
        }

        System.out.println("Ascending order based on cost..");
        Collections.sort(list,((o1, o2) ->  Double.compare(o1.getCost(),o2.getCost()) ));
        for (WingsDTO w:list
        ) {
            System.out.println(w);
        }
        System.out.println("Ascending order based on type..");
        Collections.sort(list,((o1, o2) -> o1.getType().compareTo(o2.getType())));
        for (WingsDTO w:list
        ) {
            System.out.println(w);
        }

        System.out.println("Descending order based on warranty..");
        Collections.sort(list,((o1, o2) ->  Integer.compare(o2.getWarranty(),o1.getWarranty()) ));
        for (WingsDTO w:list
        ) {
            System.out.println(w);
        }

        System.out.println("Descending order based on cost..");
        Collections.sort(list,((o1, o2) ->  Double.compare(o2.getCost(),o1.getCost()) ));
        for (WingsDTO w:list
        ) {
            System.out.println(w);
        }
        System.out.println("Descending order based on type..");
        Collections.sort(list,((o1, o2) -> o2.getType().compareTo(o1.getType())));
        for (WingsDTO w:list
        ) {
            System.out.println(w);
        }
    }
}
