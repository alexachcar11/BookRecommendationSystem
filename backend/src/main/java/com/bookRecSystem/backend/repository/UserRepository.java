package com.bookrecsystem.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookrecsystem.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

    
}
