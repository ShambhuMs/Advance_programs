package com.xworkz.map.runner;

import com.xworkz.map.dto.AddressDTO;
import com.xworkz.map.dto.PersonDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonRunner {
    public static void main(String[] args) {
        PersonDTO personDTO1=new PersonDTO("Shambhu","Shambhu@gmail.com");
        PersonDTO personDTO2=new PersonDTO("Nitin","nitin@gmail.com");
        PersonDTO personDTO3=new PersonDTO("Shambhulinga","Shambhulinga@gmail.com");
        PersonDTO personDTO4=new PersonDTO("Suhas","Suhas@gmail.com");
        PersonDTO personDTO5=new PersonDTO("Shreyas","Shreyas@gmail.com");

        AddressDTO addressDTO1=new AddressDTO(101,587145,"Ns palya");
        AddressDTO addressDTO2=new AddressDTO(102,587146,"Micro layout");
        AddressDTO addressDTO3=new AddressDTO(103,587147,"Btm");
        AddressDTO addressDTO4=new AddressDTO(104,587148,"Rajajinagar");
        AddressDTO addressDTO5=new AddressDTO(105,587149,"Jayanagar");



        Map<PersonDTO,AddressDTO> map=new HashMap<>();
        map.put(personDTO1,addressDTO1);
        map.put(personDTO2,addressDTO2);
        map.put(personDTO3,addressDTO3);
        map.put(personDTO4,addressDTO4);
        map.put(personDTO5,addressDTO5);
        PersonDTO personDTO6=new PersonDTO("Kiran","Suhas@gmail.com");
        AddressDTO addressDTO6=new AddressDTO(106,587150,"RR Nagar");
        System.out.println("Person6 is existing: " +map.containsKey(personDTO6));
        map.put(personDTO6,addressDTO6);
        Set<PersonDTO> set=map.keySet();
        set.forEach(s-> System.out.println(s));

        map.forEach((k,v)-> System.out.println(k+":"+v));



    }
}
