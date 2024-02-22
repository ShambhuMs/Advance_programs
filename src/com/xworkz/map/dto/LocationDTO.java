package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LocationDTO implements Serializable {
    private int pincode;
    private String streetName;
    private long ownerNo;
}
