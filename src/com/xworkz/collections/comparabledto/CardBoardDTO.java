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

        return this.color.compareTo(o.color);
    }
}
