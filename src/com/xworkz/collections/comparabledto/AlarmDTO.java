package com.xworkz.collections.comparabledto;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class AlarmDTO implements Comparable<AlarmDTO>{
    private String type;
    private int quantity;
    private double cost;

    @Override
    public int compareTo(AlarmDTO o) {
        int no= Integer.compare(this.quantity,o.quantity);
        return no;
    }

}
