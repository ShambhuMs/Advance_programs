package com.xworkz.collections.comparator;

import com.xworkz.collections.standardDTO.SparkPlugDTO;

import java.util.Comparator;

public class SparkPlugComparator implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
class SparkPlugComparatorQuantityDesc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
class SparkPlugComparatorCost implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
class SparkPlugComparatorCostDesc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
class SparkPlugComparatorBrand implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getBrand(), o2.getBrand());
    }
}
class SparkPlugComparatorBrandDesc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getBrand(), o1.getBrand());
    }
}
class SparkPlugComparatorType implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
class SparkPlugComparatorTypeDesc implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
    }
}