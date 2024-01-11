package com.xworkz.collections.standardDTO;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class StreetDTO {
    private String streetName;
    private int noOfShop;
    private double length;
    private String shopName;
}
