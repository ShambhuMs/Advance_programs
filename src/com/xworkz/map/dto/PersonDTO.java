package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO implements Serializable {
 private String name;
 private String email;

 @Override
 public boolean equals(Object obj) {
  if(!(obj instanceof PersonDTO)){
   return false;
  }
   PersonDTO personDTO=(PersonDTO) obj;
  return Objects.equals(getEmail(),personDTO.getEmail());
 }

 @Override
 public int hashCode() {
  return Objects.hash(getEmail());
 }
}
