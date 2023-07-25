package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.Questions;

import java.util.List;

public interface QuestionsService {

    Questions creer(Questions questions);

    List<Questions> lire();

    Questions modifier(long id,Questions questions);

    String supprimer(long id);
}
