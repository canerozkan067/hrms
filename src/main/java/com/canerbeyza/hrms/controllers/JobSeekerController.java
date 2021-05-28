package com.canerbeyza.hrms.controllers;

import com.canerbeyza.hrms.dtos.JobSeekerDto;
import com.canerbeyza.hrms.entities.JobSeeker;
import com.canerbeyza.hrms.services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobSeekerController {

    @Autowired
    private JobSeekerService jobSeekerService;

    @PostMapping("/add")
    public void add(@RequestBody JobSeekerDto jobSeekerDto) {
        jobSeekerService.jobSeekerAdd(jobSeekerDto);
    }

    @GetMapping
    public ResponseEntity<?> getAllJobSeekers() {
        List<JobSeekerDto> allJobSeekers = jobSeekerService.getAllJobSeekers();
        return ResponseEntity.ok().body(allJobSeekers);
    }
}
