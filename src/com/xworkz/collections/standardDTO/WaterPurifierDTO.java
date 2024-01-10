package com.xworkz.collections.standardDTO;

import lombok.*;

@AllArgsConstructor
@ToString
@Setter
@Getter
@NoArgsConstructor
public class WaterPurifierDTO {
    private String brand;
    private int quantity;
    private double cost;

    private int waranty;
}
