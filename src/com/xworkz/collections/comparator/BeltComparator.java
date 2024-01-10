package com.xworkz.collections.comparator;

import com.xworkz.collections.standardDTO.BeltDTO;

import java.util.Comparator;

public class BeltComparator implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class BeltComparatorCostDesc implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }

}
class BeltComparatorQuantity implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
class BeltComparatorQuantityDesc implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }

}
class BeltComparatorType implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
class BeltComparatorTypeDesc implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
    }

}

class BeltComparatorColor implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getColor(), o2.getColor());
    }

}
class BeltComparatorColorDesc implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getColor(), o1.getColor());
    }

}
