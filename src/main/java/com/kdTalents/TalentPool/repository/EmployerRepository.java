package com.kdTalents.TalentPool.repository;


import com.kdTalents.TalentPool.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends JpaRepository <Employer, Long>  {

}
