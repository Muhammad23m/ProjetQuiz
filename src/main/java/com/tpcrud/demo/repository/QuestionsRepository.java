package com.tpcrud.demo.repository;

import com.tpcrud.demo.modele.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsRepository extends JpaRepository<Questions, Long> {
}
