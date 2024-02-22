package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class BuildingDTO implements Serializable {
    private int noOfFloor;
    private String buildingName;
    private int buildingNo;

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof BuildingDTO)) {
            return false;
        }
        BuildingDTO buildingDTO=(BuildingDTO) obj;
        return Objects.equals(getBuildingName(),buildingDTO.getBuildingName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBuildingName());
    }
}
