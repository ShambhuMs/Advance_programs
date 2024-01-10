package com.xworkz.collections.comparator;

import com.xworkz.collections.standardDTO.CharcoalDTO;

import java.util.Comparator;

public class CharcoalComparator implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
class CharcoalComparatorQuantityDesc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
class CharcoalComparatorCost implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class CharcoalComparatorCostDesc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
class CharcoalComparatorType implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
class CharcoalComparatorTypeDesc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
    }
}


