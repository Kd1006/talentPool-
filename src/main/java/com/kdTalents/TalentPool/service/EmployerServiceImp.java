package com.kdTalents.TalentPool.service;


import com.kdTalents.TalentPool.entity.Employer;
import com.kdTalents.TalentPool.repository.EmployerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerServiceImp implements EmployerService {
    private final EmployerRepository employerRepository;

    public EmployerServiceImp(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }


    @Override
    public List<Employer> getAllEmployers() {
        return(List<Employer>) employerRepository.findAll();
    }

    @Override
    public Employer addEmployer(Employer employer) {
        return employerRepository.save(employer);

    }

    @Override
    public void  deleteEmployerById(Long EmployerId) {
         employerRepository.deleteById(EmployerId);

    }
}
