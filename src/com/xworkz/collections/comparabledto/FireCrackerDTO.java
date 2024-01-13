package com.xworkz.collections.comparabledto;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class FireCrackerDTO implements Comparable<FireCrackerDTO>{
    private double heat;
    private String fuel;
    private String color;
    @Override
    public int compareTo(FireCrackerDTO o) {
        int s=Double.compare(this.heat,o.heat);
        return s;
    }
}
