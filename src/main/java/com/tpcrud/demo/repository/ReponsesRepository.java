package com.tpcrud.demo.repository;

import com.tpcrud.demo.modele.Reponses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReponsesRepository extends JpaRepository <Reponses, Long> {
}
