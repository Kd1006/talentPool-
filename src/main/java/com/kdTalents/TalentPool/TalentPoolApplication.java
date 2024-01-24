package com.kdTalents.TalentPool;

import com.kdTalents.TalentPool.entity.Employer;
import com.kdTalents.TalentPool.entity.JobSeeker;
import com.kdTalents.TalentPool.repository.EmployerRepository;
import com.kdTalents.TalentPool.repository.JobSeekerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TalentPoolApplication implements CommandLineRunner {

	@Autowired
	private JobSeekerRepository jobSeekerRepository;
	@Autowired
	private EmployerRepository employerRepository;

	private static final Logger logger = LoggerFactory.getLogger(TalentPoolApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TalentPoolApplication.class, args);
		logger.info("Application Started");

	}

	@Override
	public void run(String... strings) throws Exception {
		Employer employer = new Employer("John" , "Doe", "Intel" );
		Employer employer1 = new Employer("David" ,"Parker", "JPMorgan");
		employerRepository.save(employer);
		employerRepository.save(employer1);


		List<JobSeeker> jobSeekersList = Arrays.asList(
				new JobSeeker("Tom" , "Adams" ,"Male", 29, "Back-end Developer", 5,"Java"),
				new JobSeeker("Laura", "Black", "FEMALE", 35, "Software Engineer ", 7, "Java, Python, Team Player"),
				new JobSeeker("Justin", "Bates", "Male", 32,"Software Developer", 6, "Flight Simulation, C#, C++"),
				new JobSeeker("Conner", "Parker", "Male",26, "Facility Security Officer", 4, "Information System, Risk Management, Policy Analysis"),
				new JobSeeker("Spencer","McCune", "Male", 32,"Flight Test Engineer", 10, "Data Monitoring, Data Analysis" ),
				new JobSeeker( "Morgan", "Stuart", "Female", 44, "Data Analyst", 12, "Research, Data Science, Game Theory"),
				new JobSeeker("Lee", "Kim", "Female", 27, "Editor", 6,"Creative Writing"),
				new JobSeeker("Dylan", "Hunter", "Male", 30, "Legislative Assistant", 8, "Policy Analysis, International Relationship"));

		jobSeekerRepository.saveAll(jobSeekersList);

		jobSeekerRepository.
				findAll().forEach(JobSeeker-> logger.info(JobSeeker.getYears_of_experience() + " " + JobSeeker.getFirstname()));

		employerRepository.findAll().forEach(Employer->logger.info(Employer.getFirstName()));

	}
}

