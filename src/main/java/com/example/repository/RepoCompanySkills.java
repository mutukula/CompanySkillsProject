package com.example.repository;

import com.example.entity.entityCompanySkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoCompanySkills extends JpaRepository<entityCompanySkills, Long> {

}
