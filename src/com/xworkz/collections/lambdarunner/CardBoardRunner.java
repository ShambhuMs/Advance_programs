package com.xworkz.collections.lambdarunner;

import com.xworkz.collections.comparabledto.CardBoardDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardBoardRunner {
    public static void main(String[] args) {
        CardBoardDTO cardBoardDTO=new CardBoardDTO("Black",100,1);
        CardBoardDTO cardBoardDTO1=new CardBoardDTO("White",200,3);
        CardBoardDTO cardBoardDTO2=new CardBoardDTO("Pink",1500,4);
        CardBoardDTO cardBoardDTO3=new CardBoardDTO("Red",1000,10);
        CardBoardDTO cardBoardDTO4=new CardBoardDTO("Gray",700,6);

        List<CardBoardDTO> list=new ArrayList<>();
        list.add(cardBoardDTO);
        list.add(cardBoardDTO1);
        list.add(cardBoardDTO2);
        list.add(cardBoardDTO3);
        list.add(cardBoardDTO4);

        System.out.println("Default Ascending order based on Color....");
        Collections.sort(list);
        for (CardBoardDTO color:list
             ) {
            System.out.println(color);
        }

        System.out.println(" Ascending order based on Cost....");
        Collections.sort(list,((o1, o2) -> Double.compare(o1.getCost(), o2.getCost()) ));
        for (CardBoardDTO c:list
             ) {
            System.out.println(c);
        }

        System.out.println(" Ascending order based on Quantity....");
        Collections.sort(list,((o1, o2) ->Integer.compare(o1.getQuantity(), o2.getQuantity()) ));
        for (CardBoardDTO c:list
             ) {
            System.out.println(c);
        }
        System.out.println("Descending order based on Color..");
        Collections.sort(list,((o1, o2) -> o1.getColor().compareTo(o2.getColor())));
        for (CardBoardDTO c:list
             ) {
            System.out.println(c);
        }
        System.out.println(" Descending order based on Cost....");
        Collections.sort(list,((o1, o2) ->Double.compare(o2.getCost(), o1.getCost()) ));
        for (CardBoardDTO c:list
        ) {
            System.out.println(c);
        }

        System.out.println(" Descending order based on Quantity....");
        Collections.sort(list,((o1, o2) -> Integer.compare(o2.getQuantity(), o1.getQuantity()) ));
        for (CardBoardDTO c:list
        ) {
            System.out.println(c);
        }
    }
}
