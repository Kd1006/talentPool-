package com.kdTalents.TalentPool.entity;

import jakarta.persistence.*;

@Entity
public class JobSeeker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name ="jobSeeker_Id")

    private Long id;
    private String firstname;
    private String lastname;
    private String gender;
    private int age;
    private String description;
    private int yearsOfExperience;
   private String skills;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name ="Employer")
    private Employer employer;

   public JobSeeker(){

   }

    public JobSeeker(String firstname, String lastname, String gender, int age, String description, int yearsOfExperience, String skills) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.description = description;
        this.yearsOfExperience = yearsOfExperience;
        this.skills = skills;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYears_of_experience() {
        return yearsOfExperience;
    }

    public void setYears_of_experience(int years_of_experience) {
        this.yearsOfExperience = years_of_experience;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
