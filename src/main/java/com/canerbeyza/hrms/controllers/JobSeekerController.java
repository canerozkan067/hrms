package com.canerbeyza.hrms.controllers;

import com.canerbeyza.hrms.dtos.JobSeekerDto;
import com.canerbeyza.hrms.entities.JobSeeker;
import com.canerbeyza.hrms.services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JobSeekerController {

    @Autowired
    private JobSeekerService jobSeekerService;

    @PostMapping("/add")
    public void add(@RequestBody JobSeekerDto jobSeekerDto) {
        jobSeekerService.jobSeekerAdd(jobSeekerDto);
    }
}
