package com.xworkz.collections.standardDTO;

import lombok.*;

@ToString
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class EsculatorDTO {
    private double capacity;
    private double maxWeight;
    private double minWeight;
    private double length;
}
