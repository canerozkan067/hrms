package com.canerbeyza.hrms.repositories;

import com.canerbeyza.hrms.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
