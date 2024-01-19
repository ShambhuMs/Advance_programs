package com.xworkz.collections.comparabledto;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class ThreadDTO implements Comparable<ThreadDTO>{
    private double length;
    private String type;
    private  double cost;
    @Override
    public int compareTo(ThreadDTO o) {

        return Double.compare(this.cost,o.cost);
    }
}
