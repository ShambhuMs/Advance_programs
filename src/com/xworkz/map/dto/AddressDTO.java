package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class AddressDTO implements Serializable {
    private int no;
    private int pincode;
    private String street;
}
