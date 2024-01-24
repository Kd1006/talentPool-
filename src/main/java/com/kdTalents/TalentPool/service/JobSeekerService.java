package com.kdTalents.TalentPool.service;





import com.kdTalents.TalentPool.entity.JobSeeker;

import java.util.List;


public interface JobSeekerService {
    List<JobSeeker> getAllJobSeekers();
    JobSeeker getJobSeekerById(Long id);
    JobSeeker addTalent(JobSeeker jobSeeker);
    void deleteJobSeekersById(Long Id);
    JobSeeker updateJobSeekersById (Long id, JobSeeker jobSeeker);

    List<JobSeeker> getAllJobSeekersByYearsOfExperience(int years_of_experience);
//    List<JobSeeker> getAllJobSeekersByYearsOfExperience(int yearsOfExperience);
}
