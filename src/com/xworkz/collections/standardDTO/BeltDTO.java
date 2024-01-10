package com.xworkz.collections.standardDTO;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
public class BeltDTO {
    private String type;
    private double cost;
    private int quantity;
    private String color;
}
