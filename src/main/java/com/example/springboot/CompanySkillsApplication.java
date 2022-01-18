package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.repository.RepoCompanySkills"})
public class CompanySkillsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanySkillsApplication.class, args);
	}


}
