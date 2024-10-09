package com.bookrecsystem.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookrecsystem.backend.model.Recommendation;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long>{
    
}
