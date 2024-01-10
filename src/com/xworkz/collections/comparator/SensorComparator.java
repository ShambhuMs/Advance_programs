package com.xworkz.collections.comparator;

import com.xworkz.collections.standardDTO.SensorDTO;

import java.util.Comparator;

public class SensorComparator implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
        }

}
class SensorComparatorDistance implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Integer.compare(o1.getDistance(), o2.getDistance());
    }
}
 class SensorComparatorType implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}

 class SensorComparatorName implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
    }

}
//In desc order......
 class SensorComparatorCostDesc implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }

}
class SensorComparatorDistanceDesc implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Integer.compare(o2.getDistance(), o1.getDistance());
    }

}
class SensorComparatorTypeDesc implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getType(), o1.getType());
    }

}
class SensorComparatorNameDesc implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getName(), o1.getName());
    }

}

