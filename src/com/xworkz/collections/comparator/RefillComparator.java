package com.xworkz.collections.comparator;

import com.xworkz.collections.standardDTO.RefillDTO;

import java.util.Comparator;

public class RefillComparator implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
class RefillComparatorQuantityDesc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
class RefillComparatorCost implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class RefillComparatorCostDesc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
class RefillComparatorBrand implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getBrand(), o2.getBrand());
    }
}
class RefillComparatorBrandDesc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getBrand(), o1.getBrand());
    }
}
class RefillComparatorType implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
class RefillComparatorTypeDesc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
    }
}
