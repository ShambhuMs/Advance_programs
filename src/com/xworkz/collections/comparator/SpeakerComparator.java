package com.xworkz.collections.comparator;

import com.xworkz.collections.standardDTO.SpeakerDTO;

import java.util.Comparator;

public class SpeakerComparator implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
class SpeakerComparatorQuantityDesc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
class SpeakerComparatorCost implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class SpeakerComparatorCostDesc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
class SpeakerComparatorBrand implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getBrand(), o2.getBrand());
    }
}
class SpeakerComparatorBrandDesc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getBrand(), o1.getBrand());
    }
}
 class SpeakerComparatorWarranty implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Integer.compare(o1.getWarranty(), o2.getWarranty());
    }
}
class SpeakerComparatorWarrantyDesc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Integer.compare(o2.getWarranty(), o1.getWarranty());
    }
}