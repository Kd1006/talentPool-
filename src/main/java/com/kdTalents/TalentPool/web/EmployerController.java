package com.kdTalents.TalentPool.web;


import com.kdTalents.TalentPool.entity.Employer;
import com.kdTalents.TalentPool.service.EmployerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employer")
public class EmployerController {
    private final EmployerService employerService;

    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }
    @GetMapping("/employers")
    public ResponseEntity<List<Employer>> getAllEmployers(){
        return new ResponseEntity<>(employerService.getAllEmployers(), HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Employer> addEmployer(@RequestBody Employer employer){
        return new ResponseEntity<>(employerService.addEmployer(employer), HttpStatus.OK);
    }
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Employer> deleteById(Long id){
//        return new

    }
