package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    Utilisateur creer( Utilisateur utilisateur);

    List<Utilisateur> lire();

    Utilisateur modifier (long id, Utilisateur utilisateur);

    String supprimer (long id);
}
