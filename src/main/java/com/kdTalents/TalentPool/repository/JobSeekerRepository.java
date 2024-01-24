package com.kdTalents.TalentPool.repository;

import com.kdTalents.TalentPool.entity.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerRepository extends JpaRepository <JobSeeker, Long> {
    List<JobSeeker> getAllJobSeekersByYearsOfExperience(int yearsOfExperience);

}
