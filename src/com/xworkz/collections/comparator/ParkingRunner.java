package com.xworkz.collections.comparator;

import com.xworkz.collections.comparator.*;
import com.xworkz.collections.standardDTO.ParkingDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParkingRunner {
    public static void main(String[] args) {
        ParkingDTO parkingDTO = new ParkingDTO(50,"Auto",100,20);
        ParkingDTO parkingDTO1 = new ParkingDTO( 60,"Car",100.3,21);
        ParkingDTO parkingDTO2 = new ParkingDTO(40,"Bike",120,22);
        ParkingDTO parkingDTO3 = new ParkingDTO(30,"Scooty",130,24);
        ParkingDTO parkingDTO4 = new ParkingDTO(70,"Large vehicle",150,28);

        List<ParkingDTO> list = new ArrayList<>();
        list.add(parkingDTO);
        list.add(parkingDTO1);
        list.add(parkingDTO2);
        list.add(parkingDTO3);
        list.add(parkingDTO4);

        System.out.println("Ascending order based on Length..");
        Comparator<ParkingDTO> comparator = new ParkingComparator();
        Collections.sort(list, comparator);
        for (ParkingDTO length : list
        ) {
            System.out.println(length);
        }
        System.out.println("=========================================================================");
        System.out.println("Ascending order based on Cost..");
        Comparator<ParkingDTO> comparator1 = new ParkingComparatorCost();
        Collections.sort(list, comparator1);
        for (ParkingDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("======================================================================== ");
        System.out.println("Ascending order based on Type..");
        Comparator<ParkingDTO> comparator2 = new ParkingComparatorType();
        Collections.sort(list, comparator2);
        for (ParkingDTO type : list
        ) {
            System.out.println(type);
        }
        System.out.println("======================================================================== ");
        System.out.println("Ascending order based on ooOfVehicle..");
        Comparator<ParkingDTO> comparator3= new ParkingComparatornoOfVehicle();
        Collections.sort(list, comparator3);
        for (ParkingDTO no : list
        ) {
            System.out.println(no);
        }
        System.out.println("======================================================================== ");
        System.out.println("All are in descending order...");
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on Length..");
        Comparator<ParkingDTO> comparator4 = new ParkingComparatorLengthDesc();
        Collections.sort(list, comparator4);
        for (ParkingDTO length : list
        ) {
            System.out.println(length);
        }
        System.out.println("=========================================================================");
        System.out.println("Descending order based on Cost..");
        Comparator<ParkingDTO> comparator5 = new ParkingComparatorCostDesc();
        Collections.sort(list, comparator5);
        for (ParkingDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("========================================================================");

        System.out.println("Descending order based on Type..");
        Comparator<ParkingDTO> comparator6 = new ParkingComparatorTypeDesc();
        Collections.sort(list, comparator6);
        for (ParkingDTO type : list
        ) {
            System.out.println(type);
        }
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on noOfVehicle..");
        Comparator<ParkingDTO> comparator7= new ParkingComparatornoOfVehicleDesc();
        Collections.sort(list, comparator7);
        for (ParkingDTO no : list
        ) {
            System.out.println(no);
        }
    }
}
