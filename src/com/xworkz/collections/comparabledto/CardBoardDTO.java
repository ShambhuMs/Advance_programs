package com.xworkz.collections.comparabledto;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class CardBoardDTO implements Comparable<CardBoardDTO>{
    private String color;
    private double cost;
    private int quantity;
    @Override
    public int compareTo(CardBoardDTO o) {
        int color=String.CASE_INSENSITIVE_ORDER.compare(this.color,o.color);
        return color;
    }
}
