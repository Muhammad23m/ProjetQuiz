package com.tpcrud.demo.modele;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Map;
import java.util.HashMap;


@Data
@Entity
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="id_quiz")
    private Long quiz;


    @Column(name = "id_utilisateur")
    private Long utilisateur;

    private Integer score;

    private static Map<Long, Boolean> resultat = new HashMap<>();

    public Long getQuiz() {
        return quiz;
    }

    public void setQuiz(Long quiz) {
        this.quiz = quiz;
    }

    public Long getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Long utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public static Map<Long, Boolean> getResultat() {
        return resultat;
    }

    public void setResultat(Map<Long, Boolean> resultat) {
        this.resultat = resultat;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
