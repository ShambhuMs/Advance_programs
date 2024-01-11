package com.xworkz.collections.standardDTO;

import lombok.*;

@AllArgsConstructor
@Getter
@ToString
@Setter
@NoArgsConstructor
public class VentilatorDTO {
    private int oxygenPoint;
    private double temperature;
    private long tensileStrength;
    private int hardness;
}
