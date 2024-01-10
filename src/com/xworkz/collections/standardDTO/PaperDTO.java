package com.xworkz.collections.comparator;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PaperDTO {
    private int quantity;
    private String type;
    private double cost;
    private int smoothness;
}
