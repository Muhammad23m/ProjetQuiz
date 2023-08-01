package com.tpcrud.demo.repository;

import com.tpcrud.demo.modele.QuizParticipation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizParticipationRepository extends JpaRepository<QuizParticipation, Long> {
}
