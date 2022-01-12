package com.example.springboot;

import com.example.controller.controllerCompanySkills;
import com.example.service.serviceCompanySkills;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanySkillsApplicationTests {

	@Test
	@DisplayName("new Skill value comparision")
	void contextLoads() {
		serviceCompanySkills service = new serviceCompanySkills("12/12/12","saiteja","Dev","javascript");

		String Actual = service.skillValidation("Dev");
		Assert.assertEquals("0",service.skillValidation("javascript"));
	}

	@Test
	@DisplayName("new skill value compared")
	public void newskill()
	{
		serviceCompanySkills service = new serviceCompanySkills("12/12/12","sai","testing","Junit");

		Assert.assertEquals("false",service.skillValidation("unit"));
	}


}
