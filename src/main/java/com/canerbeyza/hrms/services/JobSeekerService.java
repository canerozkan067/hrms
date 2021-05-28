package com.canerbeyza.hrms.services;

import com.canerbeyza.hrms.dtos.JobSeekerDto;
import com.canerbeyza.hrms.entities.JobSeeker;
import com.canerbeyza.hrms.entities.User;
import com.canerbeyza.hrms.repositories.JobSeekerRepository;
import com.canerbeyza.hrms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class JobSeekerService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JobSeekerRepository jobSeekerRepository;

    public void jobSeekerAdd(JobSeekerDto jobSeekerDto) {
        User user = new User();
        user.setEmail(jobSeekerDto.getEmail());
        user.setPassword(jobSeekerDto.getPassword());

        User inDb = userRepository.save(user);

        JobSeeker jobSeeker = new JobSeeker();
        jobSeeker.setFirstName(jobSeekerDto.getFirstName());
        jobSeeker.setLastName(jobSeekerDto.getLastName());
        jobSeeker.setNationalNo(jobSeekerDto.getNationalNo());
        jobSeeker.setYearOfBirthDate(jobSeekerDto.getBirthDate());
        jobSeeker.setUser(inDb);

        jobSeekerRepository.save(jobSeeker);

    }

    public List<JobSeekerDto> getAllJobSeekers() {
        return jobSeekerRepository.findAll().stream().map(JobSeekerDto::new).collect(Collectors.toList());
    }
}
