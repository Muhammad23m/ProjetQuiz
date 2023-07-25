package com.tpcrud.demo.repository;

import com.tpcrud.demo.modele.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository <Quiz, Long> {
}
