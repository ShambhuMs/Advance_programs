package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@Setter
@AllArgsConstructor
@Getter
@ToString
public class JobDTO implements Serializable {
    private String designation;
    private double salary;
    private int jobId;

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof JobDTO)) return false;
        JobDTO jobDTO=(JobDTO) obj;
        return Objects.equals(getSalary(),jobDTO.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSalary());
    }
}
