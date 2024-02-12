package com.xworkz.collection.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Getter
public class PlaygroundDTO implements Serializable,Comparable<PlaygroundDTO> {
    private String groundName;
    private String location;
    private int area;
    private String typeofgame;
    @Override
    public int compareTo(PlaygroundDTO o) {
        return String.CASE_INSENSITIVE_ORDER.compare(this.groundName,o.groundName);
    }
}
