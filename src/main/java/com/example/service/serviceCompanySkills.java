package com.example.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class serviceCompanySkills {
    private String Id;
    private String Name;
    private String DOB;
    private String Skills;
    private String newSkill;

    public String getNewSkill() {
        return newSkill;
    }

    public void setNewSkill(String newSkill) {
        this.newSkill = newSkill;
    }



    public serviceCompanySkills(String Dob, String name, String skills, String NewSkill){
        this.Name = name;
        this.DOB =Dob;
        this.Skills =skills;
        this.newSkill = NewSkill;
    }
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String skills) {
        Skills = skills;
    }

    public String skillValidation(String skills)
     {
         if(skills.equals(newSkill))
         {
             String Value ="0";
             return Value;
         }
         else
         {
             return "false";
         }
     }


}
