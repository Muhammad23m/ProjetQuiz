package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.Reponses;
import com.tpcrud.demo.modele.Utilisateur;

import java.util.List;

public interface ReponsesService {



    Reponses creer(Reponses reponses);

    List<Reponses> lire();


    Reponses modifier(long id, Reponses reponses);


    String supprimer(long id);
}
