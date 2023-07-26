package com.tpcrud.demo.repository;

import com.tpcrud.demo.modele.Participation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParticipationRepository extends JpaRepository <Participation, Long>{
   Participation creer(Participation participation);
    List<Participation> lire();

    Participation modifier(Long id, Participation participation);

    String supprimer(long id);
}
