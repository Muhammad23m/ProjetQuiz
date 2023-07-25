package com.tpcrud.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nomQuiz;
    @Column
    private String catQuiz;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Questions> questions;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_utilisateur", nullable = false)
    private Utilisateur utilisateur;

    public Quiz(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Quiz() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Quiz(Long id, String nomQuiz, String catQuiz, Utilisateur utilisateur) {
        this.id = id;
        this.nomQuiz = nomQuiz;
        this.catQuiz = catQuiz;
        this.utilisateur = utilisateur;
    }

    public void setNomQuiz(String nomQuiz) {
        this.nomQuiz = nomQuiz;
    }

    public void setCatQuiz(String catQuiz) {
        this.catQuiz = catQuiz;
    }

    public Long getId() {
        return id;
    }

    public String getNomQuiz() {
        return nomQuiz;
    }

    public String getCatQuiz() {
        return catQuiz;
    }
}

