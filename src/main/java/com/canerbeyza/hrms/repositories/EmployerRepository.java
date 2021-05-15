package com.canerbeyza.hrms.repositories;

import com.canerbeyza.hrms.entities.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer,Long> {
}
