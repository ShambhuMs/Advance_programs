package com.xworkz.collections.standardDTO;

import lombok.*;

@AllArgsConstructor
@ToString
@Setter
@Getter
@NoArgsConstructor
public class SparkPlugDTO {
    private String type;
    private String brand;
    private double cost;
    private int quantity;

}
