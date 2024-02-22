package com.xworkz.map.runner;

import com.xworkz.map.dto.BuildingDTO;
import com.xworkz.map.dto.LocationDTO;

import java.util.HashMap;
import java.util.Map;

public class BuildingRunner {
    public static void main(String[] args) {
        BuildingDTO buildingDTO1=new BuildingDTO(1,"Mallikarjuna Nilaya",111);
        BuildingDTO buildingDTO3=new BuildingDTO(3,"SMS",112);
        BuildingDTO buildingDTO2=new BuildingDTO(2,"Indiquebe",113);
        BuildingDTO buildingDTO4=new BuildingDTO(4,"RNS",114);
        BuildingDTO buildingDTO5=new BuildingDTO(5,"Balaji",115);
        BuildingDTO buildingDTO6=new BuildingDTO(6,"Venkatesh Nilaya",116);
        BuildingDTO buildingDTO7=new BuildingDTO(7,"Infosys",117);
        BuildingDTO buildingDTO8=new BuildingDTO(8,"Infotech",118);
        BuildingDTO buildingDTO9=new BuildingDTO(9,"Techpark",119);


        LocationDTO locationDTO1=new LocationDTO(123456,"Gandhinagar",1234567890l);
        LocationDTO locationDTO2=new LocationDTO(123457,"BTM 2nd stage",1234567809l);
        LocationDTO locationDTO3=new LocationDTO(123458,"BTM 1st stage",1234567890l);
        LocationDTO locationDTO4=new LocationDTO(123459,"JP nagar",6364208702l);
        LocationDTO locationDTO5=new LocationDTO(123451,"Vijayanagar",8861021958l);
        LocationDTO locationDTO6=new LocationDTO(123452,"Jayanagar",9591064376l);
        LocationDTO locationDTO7=new LocationDTO(123453,"Konankunte",6362433200l);
        LocationDTO locationDTO8=new LocationDTO(123454,"Hosnagar",652489712l);
        LocationDTO locationDTO9=new LocationDTO(123455,"Kengeri",456789123l);


        Map<BuildingDTO,LocationDTO> map=new HashMap<>();
        map.put(buildingDTO1,locationDTO1);
        map.put(buildingDTO2,locationDTO2);
        map.put(buildingDTO3,locationDTO3);
        map.put(buildingDTO4,locationDTO4);
        map.put(buildingDTO5,locationDTO5);
        map.put(buildingDTO6,locationDTO6);
        map.put(buildingDTO7,locationDTO7);
        map.put(buildingDTO8,locationDTO8);
        map.put(buildingDTO9,locationDTO9);

        BuildingDTO buildingDTO10=new BuildingDTO(10,"SMS",110);
        LocationDTO locationDTO10=new LocationDTO(123476,"Chickpete",7894561230l);
        map.put(buildingDTO10,locationDTO10);
        map.forEach((k,v)-> System.out.println(k+":"+v));
    }
}
