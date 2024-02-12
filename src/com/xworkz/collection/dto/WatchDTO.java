package com.xworkz.collection.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WatchDTO implements Serializable,Comparable<WatchDTO> {
    private String brand;
    private int warranty;
    private double cost;
    private String type;
    @Override
    public int compareTo(WatchDTO o) {
        return Integer.compare(this.warranty,o.warranty);
    }
}
