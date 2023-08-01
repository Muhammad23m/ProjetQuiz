package com.tpcrud.demo.repository;

import com.tpcrud.demo.modele.QuestionReponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionReponseRepository extends JpaRepository<QuestionReponse, Long> {
}

