package com.xworkz.collections.comparator;

import com.xworkz.collections.standardDTO.ParkingDTO;

import java.util.Comparator;

public class ParkingComparator implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return  Double.compare(o1.getParkingAreaLength(), o2.getParkingAreaLength());
    }
}
class ParkingComparatorLengthDesc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return  Double.compare(o2.getParkingAreaLength(), o1.getParkingAreaLength());
    }
}
 class ParkingComparatorCost implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return  Double.compare(o1.getCost(), o2.getCost());
    }
}
class ParkingComparatorCostDesc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return  Double.compare(o2.getCost(), o1.getCost());
    }
}
class ParkingComparatornoOfVehicle implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return  Double.compare(o1.getNoOfVehicle(), o2.getNoOfVehicle());
    }
}
class ParkingComparatornoOfVehicleDesc implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return  Double.compare(o2.getNoOfVehicle(), o1.getNoOfVehicle());
    }
}
class ParkingComparatorType implements Comparator<ParkingDTO> {

    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
class ParkingComparatorTypeDesc implements Comparator<ParkingDTO> {

    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
    }
}