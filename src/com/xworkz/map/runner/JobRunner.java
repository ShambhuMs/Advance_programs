package com.xworkz.map.runner;

import com.xworkz.map.dto.CompanyDTO;
import com.xworkz.map.dto.JobDTO;

import java.util.HashMap;
import java.util.Map;

public class JobRunner {
    public static void main(String[] args) {
        JobDTO jobDTO1=new JobDTO("Java software developer",3.0,101);
        JobDTO jobDTO2=new JobDTO("Python software developer",3.1,102);
        JobDTO jobDTO3=new JobDTO("PHP  developer",3.2,103);
        JobDTO jobDTO4=new JobDTO("Junior software developer",3.3,104);
        JobDTO jobDTO5=new JobDTO("Senior software developer",3.4,105);
        JobDTO jobDTO6=new JobDTO("FrontEnd developer",3.5,106);
        JobDTO jobDTO7=new JobDTO("Backend developer",3.6,107);
        JobDTO jobDTO8=new JobDTO("Angular.js software developer",3.7,108);
        JobDTO jobDTO9=new JobDTO("Spring software developer",3.8,109);
        JobDTO jobDTO10=new JobDTO("Springboot software developer",3.9,110);

        CompanyDTO companyDTO1=new CompanyDTO("Btm",500,9874561230l);
        CompanyDTO companyDTO2=new CompanyDTO("Rajajinagar",501,9874561230l);
        CompanyDTO companyDTO3=new CompanyDTO("Mumbai",502,9874561230l);
        CompanyDTO companyDTO4=new CompanyDTO("Chennai",503,9874561230l);
        CompanyDTO companyDTO5=new CompanyDTO("Hyderabad",504,9874561230l);
        CompanyDTO companyDTO6=new CompanyDTO("Manglore",505,9874561230l);
        CompanyDTO companyDTO7=new CompanyDTO("Udupi",506,9874561230l);
        CompanyDTO companyDTO8=new CompanyDTO("Udupi",507,9874561230l);
        CompanyDTO companyDTO9=new CompanyDTO("WhiteField",508,9874561230l);
        CompanyDTO companyDTO10=new CompanyDTO("Belgaum",509,9874561230l);

        Map<JobDTO,CompanyDTO> map=new HashMap<>();
        map.put(jobDTO1,companyDTO1);
        map.put(jobDTO2,companyDTO2);
        map.put(jobDTO3,companyDTO3);
        map.put(jobDTO4,companyDTO4);
        map.put(jobDTO5,companyDTO5);
        map.put(jobDTO6,companyDTO6);
        map.put(jobDTO7,companyDTO7);
        map.put(jobDTO8,companyDTO8);
        map.put(jobDTO9,companyDTO9);
        map.put(jobDTO10,companyDTO10);

        JobDTO jobDTO11=new JobDTO("Android developer",3.6,118);
        CompanyDTO companyDTO11=new CompanyDTO("Delhi",5005,7418529630l);
        map.put(jobDTO11,companyDTO11);
        map.forEach((k,v)-> System.out.println(k+":"+v));
    }
}
