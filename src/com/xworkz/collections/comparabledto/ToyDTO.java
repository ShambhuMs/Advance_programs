package com.xworkz.collections.comparabledto;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class ToyDTO implements Comparable<ToyDTO>{
    private String type;
    private double cost;
    private int quantity;
    @Override
    public int compareTo(ToyDTO o) {
        return this.type.compareTo(o.type);
    }
}
