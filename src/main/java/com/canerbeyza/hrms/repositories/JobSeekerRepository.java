package com.canerbeyza.hrms.repositories;

import com.canerbeyza.hrms.entities.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerRepository extends JpaRepository<JobSeeker,Long> {
}
