package com.xworkz.collections.comparabledto;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class RopeDTO implements Comparable<RopeDTO>{
    private double length;
    private String type;
    private  double cost;
    @Override
    public int compareTo(RopeDTO o) {
        return Double.compare(this.length,o.length);
    }
}
