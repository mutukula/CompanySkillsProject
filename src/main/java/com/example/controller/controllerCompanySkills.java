package com.example.controller;

import com.example.entity.entityCompanySkills;
import com.example.exception.exceptionCompanySkills;
import com.example.repository.RepoCompanySkills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping(value = "/api/companySkills/")
public class controllerCompanySkills {

    @Autowired
    private RepoCompanySkills COMPANYSKILLS;


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

    @DeleteMapping("/{Id}")
    public ResponseEntity DeleteByID(@PathVariable Long Id){
      COMPANYSKILLS.deleteAllById(Collections.singleton(Id));
      if(Id == null){
          throw new exceptionCompanySkills("user not found");
      }
      return new ResponseEntity(Id, HttpStatus.OK);
    }
}
