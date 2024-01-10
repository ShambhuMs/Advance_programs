package com.xworkz.collections.standardDTO;

import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
public class ParkingDTO {
    private double cost;
    private String type;
    private double parkingAreaLength;
    private int noOfVehicle;
}
