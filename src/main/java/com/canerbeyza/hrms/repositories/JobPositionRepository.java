package com.canerbeyza.hrms.repositories;

import com.canerbeyza.hrms.entities.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionRepository extends JpaRepository<JobPosition,Long> {
}
