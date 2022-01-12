package com.example.controller;

import com.example.entity.entityCompanySkills;
import com.example.exception.exceptionCompanySkills;
import com.example.repository.RepoCompanySkills;
import com.example.service.serviceCompanySkills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/companySkills")
public class controllerCompanySkills {

    @Autowired
    private RepoCompanySkills COMPANYSKILLS;

    @GetMapping
    public entityCompanySkills Getname(@PathVariable Long Id )
    {
        return (entityCompanySkills) COMPANYSKILLS.findAll();
    }

    @PostMapping
    public entityCompanySkills PostMap(@RequestBody entityCompanySkills companySkills)
    {
       return COMPANYSKILLS.save(companySkills);
    }

    @GetMapping("/{Id}")
    public entityCompanySkills GetByID(@PathVariable (value = "Id") Long Id){
        return COMPANYSKILLS.findById(Id).orElseThrow(()-> new exceptionCompanySkills("user not found"));
    }



    @PutMapping("/{Id}")
    public entityCompanySkills putmap(@RequestBody  entityCompanySkills companySkills, @PathVariable (value = "Id") Long Id){
    entityCompanySkills expected =   COMPANYSKILLS.findById(Id).orElseThrow(()-> new exceptionCompanySkills("user not found"));

    expected.setName(companySkills.getName());
    expected.setSkill(companySkills.getSkill());
    expected.setDOB(companySkills.getDOB());
    return COMPANYSKILLS.save(expected);

    }
}
