package com.xworkz.collections.standardDTO;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class RefillDTO {
    private int quantity;
    private double cost;
    private String type;
    private String brand;
}
