package com.kdTalents.TalentPool.service;


import com.kdTalents.TalentPool.entity.Employer;
import com.kdTalents.TalentPool.exception.ResourceNotFoundException;
import com.kdTalents.TalentPool.repository.EmployerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployerServiceImp implements EmployerService {
    private final EmployerRepository employerRepository;

    public EmployerServiceImp(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }


    @Override
    public List<Employer> getAllEmployers() {

        return employerRepository.findAll();
    }

    @Override
    public Employer getEmployersById(Long Id){
        return employerRepository.findById(Id)
                .orElseThrow(()-> new ResourceNotFoundException("Employer with id " + Id + "not found"));


    }

    @Override
    public Employer addEmployer(Employer employer) {
        return employerRepository.save(employer);

    }

    @Override
    public void  deleteEmployerById(Long Id) {
         employerRepository.deleteById(Id);

    }
    public Employer updateEmployerById(Long Id, @RequestBody Employer employer){
        Employer existingEmployers = getEmployersById(Id);
        existingEmployers.setFirstName(employer.getFirstName());
        existingEmployers.setLastName((employer.getFirstName()));
        existingEmployers.setCompany_name(employer.getCompany_name());
        existingEmployers.setDescription(employer.getDescription());
        return existingEmployers;
    }
}
