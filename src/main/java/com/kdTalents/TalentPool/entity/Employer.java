package com.kdTalents.TalentPool.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long EmployerId;
    private String firstName;
    private String lastName;
    private String company_name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employer")
    @JsonIgnore
    private List<JobSeeker> TalentPool;

    public Employer() {

    }

    public Employer(String firstName, String lastName, String company_name) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.company_name = company_name;
    }

    public Long getEmployerId() {
        return EmployerId;
    }

    public void setEmployerId(Long employerId) {
        EmployerId = employerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public List<JobSeeker> getTalentPool() {
        return TalentPool;
    }

    public void setTalentPool(List<JobSeeker> talentPool) {
        TalentPool = talentPool;
    }
}
