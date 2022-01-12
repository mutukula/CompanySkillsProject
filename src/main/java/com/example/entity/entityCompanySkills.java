package com.example.entity;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.tuple.GeneratedValueGeneration;

import javax.persistence.*;

@Entity
@Table(name= "companySkills")
public class entityCompanySkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "Name")
    private String Name;
    @Column(name ="Skill")
    private String Skill;
    @Column(name="DOB")
    private String DOB;

    @Column(name="NewSkill")
    private String NewSkill;
    public String getNewSkill() {
        return NewSkill;
    }

    public void setNewSkill(String newSkill) {
        NewSkill = newSkill;
    }
    public entityCompanySkills(){

    }


    public entityCompanySkills(String name, String skill, String Dob, String newSkill)
    {
        super();
        this.Name =name;
        this.Skill =skill;
        this.DOB=Dob;
        this.NewSkill=newSkill;
    }
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSkill() {
        return Skill;
    }

    public void setSkill(String skill) {
        Skill = skill;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }


}
