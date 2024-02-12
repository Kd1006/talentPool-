package com.kdTalents.TalentPool.service;



import com.kdTalents.TalentPool.entity.Employer;

import java.util.List;

public interface EmployerService {
    List<Employer> getAllEmployers();
    Employer addEmployer(Employer employer);

    Employer getEmployersById(Long Id);
    Employer updateEmployerById(Long Id, Employer employer);

    void deleteEmployerById(Long Id);




}
