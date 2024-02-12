package com.xworkz.collection.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@Setter
@ToString
@NoArgsConstructor
public class DiseaseDTO implements Serializable,Comparable<DiseaseDTO> {
    private String name;
    private double treatmentCost;
    private int noOfdays;
    @Override
    public int compareTo(DiseaseDTO o) {
        return Integer.compare(this.noOfdays,o.noOfdays);
    }
}
