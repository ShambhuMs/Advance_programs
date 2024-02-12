package com.xworkz.collection.runner;

import com.xworkz.collection.dto.PlaygroundDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlaygroundRunner {
    public static void main(String[] args) {
        PlaygroundDTO playgroundDTO=new PlaygroundDTO("SwamiVivekananda","BTM",400,"Cricket");
        PlaygroundDTO playgroundDTO1=new PlaygroundDTO("Chinnaswamy","Bengaluru",600,"Cricket");
        PlaygroundDTO playgroundDTO2=new PlaygroundDTO("Watertank","Micro layout",100,"Kabaddi");
        PlaygroundDTO playgroundDTO3=new PlaygroundDTO("Gandhi","Brahmavara",300,"Kho-Kho");
        PlaygroundDTO playgroundDTO4=new PlaygroundDTO("Nehru","Rajajinagar",120,"Volleyball");
        List<PlaygroundDTO> list=new ArrayList<>();
        list.add(playgroundDTO);
        list.add(playgroundDTO1);
        list.add(playgroundDTO2);
        list.add(playgroundDTO3);
        list.add(playgroundDTO4);
        System.out.println("Default sort....");
        Collections.sort(list);
        list.forEach(o1-> System.out.println(o1));

        System.out.println("Ascending order based on location");
        Collections.sort(list,(o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getLocation(),o2.getLocation()));
        list.forEach(o-> System.out.println(o));
        System.out.println("Descending order based on location");
        Collections.sort(list,(o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2.getLocation(),o1.getLocation()));
        list.forEach(o-> System.out.println(o));

        System.out.println("Ascending order based on Area");
        Collections.sort(list,(o1, o2) -> Integer.compare(o1.getArea(), o2.getArea()));
        list.forEach(o-> System.out.println(o));
        System.out.println("Descending order based on Area");
        Collections.sort(list,(o1, o2) -> Integer.compare(o2.getArea(), o1.getArea()));
        list.forEach(o-> System.out.println(o));

        System.out.println("Ascending order based on type");
        Collections.sort(list,(o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getTypeofgame(), o2.getTypeofgame()));
        list.forEach(o-> System.out.println(o));
        System.out.println("Descending order based on type");
        Collections.sort(list,(o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2.getTypeofgame(), o1.getTypeofgame()));
        list.forEach(o-> System.out.println(o));

    }
}
