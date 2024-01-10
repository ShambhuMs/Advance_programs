package com.xworkz.collections.standardDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SensorDTO  {
    private  String name;
    private String type;
    private double cost;
    private int distance;
}

