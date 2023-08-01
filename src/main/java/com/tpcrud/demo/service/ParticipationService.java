package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.Participation;

import java.util.List;


public interface ParticipationService {
    //calcul du score d'une participation
    Integer calculerScore(Participation participation);
    Participation creer(Participation participation);
    List<Participation> lire();

}
