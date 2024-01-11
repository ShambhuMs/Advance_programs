package com.xworkz.collections.standardDTO;

import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
public class ShipDTO {
    private String name;
    private  String type;
    private double cost;
    private long capacity;
}
