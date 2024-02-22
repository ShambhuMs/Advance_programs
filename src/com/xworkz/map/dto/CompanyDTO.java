package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO implements Serializable {
    private String location;
    private int noOfEmployee;
    private long contactNo;
}
