package com.kdTalents.TalentPool.web;


import com.kdTalents.TalentPool.TalentPoolApplication;
import com.kdTalents.TalentPool.entity.Employer;
import com.kdTalents.TalentPool.service.EmployerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/employer")
@CrossOrigin(origins = "http://localhost:9090")
public class EmployerController {
    private static final Logger logger = LoggerFactory.getLogger(EmployerController.class);
    private final EmployerService employerService;

    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }
    @GetMapping("/employers")
    public ResponseEntity<List<Employer>> getAllEmployers(){


        return new ResponseEntity<>(employerService.getAllEmployers(), HttpStatus.NO_CONTENT);
    }
    @GetMapping("{Id}")
    public ResponseEntity<Employer> getEmployersById(@PathVariable Long EmployerId){
        return new ResponseEntity<>(employerService.getEmployersById(EmployerId), HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Employer> addEmployer(@RequestBody Employer employer){
        return new ResponseEntity<>(employerService.addEmployer(employer), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<Employer> deleteEmployerById(Long EmployerId){
         employerService.deleteEmployerById(EmployerId);
         return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update/{Id}")
    public ResponseEntity<Employer> updateEmployerById(Long EmployerId, @RequestBody Employer employer){
        return new ResponseEntity<>(employerService.updateEmployerById(EmployerId, employer), HttpStatus.OK);
    }

    }
