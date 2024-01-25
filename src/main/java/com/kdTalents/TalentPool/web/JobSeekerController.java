package com.kdTalents.TalentPool.web;


import com.kdTalents.TalentPool.entity.JobSeeker;
import com.kdTalents.TalentPool.service.JobSeekerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jobSeeker")

public class JobSeekerController {
    private final JobSeekerService jobSeekerService;

    public JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;

    }
    @GetMapping("/jobSeekers")
    public ResponseEntity<List<JobSeeker>> getAllJobSeekers(){

        return new ResponseEntity<>(jobSeekerService.getAllJobSeekers(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<JobSeeker> getJobSeekerById(@PathVariable Long id){
        return new ResponseEntity<>(jobSeekerService.getJobSeekerById(id), HttpStatus.OK);

    }
    @PostMapping("/add")
    public ResponseEntity<JobSeeker> addTalent(@RequestBody JobSeeker jobSeeker){
        return new ResponseEntity<>(jobSeekerService.addTalent(jobSeeker),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<JobSeeker> deleteJobSeekerById(@PathVariable Long id) {
        jobSeekerService.deleteJobSeekersById(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    @PutMapping("/update/{id}")
    public ResponseEntity<JobSeeker> updateJobSeekersById(@PathVariable Long id, @RequestBody JobSeeker jobSeeker){
        return new ResponseEntity<>(jobSeekerService.updateJobSeekersById(id, jobSeeker), HttpStatus.OK);

    }
    @GetMapping("/years_of_experience/{years_of_experience}")
    public ResponseEntity<List<JobSeeker>> getAllJobSeekersByYearsOfExperience(@PathVariable int years_of_experience){
        return new ResponseEntity<>(jobSeekerService.getAllJobSeekersByYearsOfExperience(years_of_experience), HttpStatus.OK);

    }
}
