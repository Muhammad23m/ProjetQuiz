package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.Quiz;
import com.tpcrud.demo.modele.Utilisateur;

import java.util.List;

public interface QuizService {




    Quiz creer(Quiz quiz);

    List<Quiz> lire();

    Quiz modifier(long id, Quiz quiz);

    String supprimer(long id);


}
