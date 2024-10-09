package com.bookrecsystem.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookrecsystem.backend.model.Recommendation;

import com.bookrecsystem.backend.repository.RecommendationRepository;

@Service
public class RecommendationService {
    
    @Autowired
    private RecommendationRepository recommendationRepository; 

    public Recommendation addRecommendation(Recommendation recommendation) { 
        return recommendationRepository.save(recommendation);
    }

    public Recommendation findRecommendationById(Long id) { 
        return recommendationRepository.findById(id).orElse(null);
    }

    public List<Recommendation> findAllRecommendations() { 
        return recommendationRepository.findAll();
    }

}
