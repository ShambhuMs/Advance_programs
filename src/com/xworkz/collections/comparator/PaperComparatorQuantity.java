package com.xworkz.collections.comparator;

import com.xworkz.collections.standardDTO.PaperDTO;

import java.util.Comparator;

public class PaperComparatorQuantity implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
 class PaperComparatorQuantityDesc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
 class PaperComparatorType implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
class PaperComparatorTypeDesc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
    }
}
class PaperComparatorCost implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class PaperComparatorCostDesc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
class PaperComparatorSmoothness implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Integer.compare(o1.getSmoothness(), o2.getSmoothness());
    }
}
class PaperComparatorSmoothnessDesc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        return Integer.compare(o2.getSmoothness(), o1.getSmoothness());
    }
}