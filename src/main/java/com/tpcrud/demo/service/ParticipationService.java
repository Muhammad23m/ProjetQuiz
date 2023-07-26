package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.Participation;


public interface ParticipationService {
    //calcul du score d'une participation
    Integer calculerScore(Participation participation);
}
