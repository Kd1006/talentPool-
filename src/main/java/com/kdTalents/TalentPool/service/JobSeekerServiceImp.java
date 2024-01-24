package com.kdTalents.TalentPool.service;




import com.kdTalents.TalentPool.entity.JobSeeker;
import com.kdTalents.TalentPool.exception.ResourceNotFoundException;
import com.kdTalents.TalentPool.repository.JobSeekerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class JobSeekerServiceImp implements JobSeekerService {
    private final JobSeekerRepository jobSeekerRepository;

    public JobSeekerServiceImp(JobSeekerRepository jobSeekerRepository) {
        this.jobSeekerRepository = jobSeekerRepository;
    }


    @Override
    public List<JobSeeker> getAllJobSeekers() {
        return (List<JobSeeker>) jobSeekerRepository.findAll();

    }

    @Override
    public JobSeeker getJobSeekerById(Long id) {
        return jobSeekerRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("JobSeeker with id" + id + "not found" ));

    }

    @Override
    public JobSeeker addTalent(JobSeeker jobSeeker) {
        return jobSeekerRepository.save(jobSeeker);
    }

    @Override
    public void deleteJobSeekersById(Long id) {
        jobSeekerRepository.deleteById(id);
    }

    @Override
    public JobSeeker updateJobSeekersById(Long id, JobSeeker jobSeeker) {
        JobSeeker existingJobSeeker = getJobSeekerById(id);
        existingJobSeeker.setFirstname(jobSeeker.getFirstname());
        existingJobSeeker.setLastname(jobSeeker.getLastname());
        existingJobSeeker.setAge(jobSeeker.getAge());
        existingJobSeeker.setDescription(jobSeeker.getDescription());
        existingJobSeeker.setGender(jobSeeker.getGender());
        existingJobSeeker.setYears_of_experience(jobSeeker.getYears_of_experience());
        existingJobSeeker.setSkills(jobSeeker.getSkills());
        return existingJobSeeker;
    }

    @Override
    public List<JobSeeker> getAllJobSeekersByYearsOfExperience(int years_of_experience) {

        return jobSeekerRepository.getAllJobSeekersByYearsOfExperience(years_of_experience);
    }
}


