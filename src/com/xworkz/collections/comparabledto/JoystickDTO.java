package com.xworkz.collections.comparabledto;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class JoystickDTO implements Comparable<JoystickDTO>{
    private String brand;
    private double cost;
    private int warranty;
    @Override
    public int compareTo(JoystickDTO o) {
        return Double.compare(this.cost,o.cost);
    }
}
