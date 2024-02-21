package com.xworkz.collection.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Getter
public class MedicineDTO implements Comparable<MedicineDTO> {
  private  String name;
  private int id;
  private String company;
  private LocalDate expiryDate;
  private LocalDate manufactureDate;
  private double cost;
  private String[] ingredients;


  @Override
  public int compareTo(MedicineDTO o) {
    return this.company.compareTo(o.getCompany());
  }
}
