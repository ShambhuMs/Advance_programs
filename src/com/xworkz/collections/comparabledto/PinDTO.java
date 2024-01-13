package com.xworkz.collections.comparabledto;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class PinDTO implements Comparable<PinDTO>{
    private String type;
    private double cost;

    @Override
    public int compareTo(PinDTO o) {
        return Double.compare(this.cost,o.cost);
    }
}
