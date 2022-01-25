package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan("com.example")
@EnableJpaRepositories(basePackages = "com.example.repository")
public class CompanySkillsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanySkillsApplication.class, args);
	}


}
