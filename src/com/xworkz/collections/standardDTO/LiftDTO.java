package com.xworkz.collections.standardDTO;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class LiftDTO {
    private double capacity;
    private  double maxWeight;
    private int maxPerson;
    private int noOfFloor;
}
