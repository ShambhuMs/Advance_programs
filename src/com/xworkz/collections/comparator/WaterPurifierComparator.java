package com.xworkz.collections.comparator;

import com.xworkz.collections.standardDTO.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierComparator implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return 0;
    }
}
class WaterPurifierComparatorQuantityDesc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
class WaterPurifierComparatorCost implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class WaterPurifierComparatorCostDesc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
class WaterPurifierComparatorBrand implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getBrand(), o2.getBrand());
    }
}
class WaterPurifierComparatoBrandrDesc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getBrand(), o1.getBrand());
    }
}
class WaterPurifierComparatorWarranty implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Integer.compare(o1.getWaranty(), o2.getWaranty());
    }
}
class WaterPurifierComparatorWarrantyDesc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Integer.compare(o2.getWaranty(), o1.getWaranty());
    }
}