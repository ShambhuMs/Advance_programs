package com.xworkz.collections.comparator;

import com.xworkz.collections.standardDTO.CoverDTO;

import java.util.Comparator;

public class CoverComparator implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o1.getSize(), o2.getSize());
    }
}
class CoverComparatorSizeDesc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o2.getSize(), o1.getSize());
    }

}
 class CoverComparatorCost implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class CoverComparatorCostDesc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }

}
class CoverComparatorType implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
class CoverComparatorTypeDesc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
    }

}

class CoverComparatorColor implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getColor(), o2.getColor());
    }

}
class CoverComparatorColorDesc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getColor(), o1.getColor());
    }

}






