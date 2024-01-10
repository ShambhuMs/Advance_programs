package com.xworkz.collections.standardDTO;

import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
public class CoverDTO {
    private String type;
    private double cost;
    private String color;
    private double size;
}
