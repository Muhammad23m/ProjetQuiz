package com.tpcrud.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Reponses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length =90 )
    private String Text;
    @ManyToOne
    @JoinColumn(name = "id_questions", nullable = false)
    private Questions questions;
    @Column
    private boolean resultat;


    public Reponses(Long id, String text, Questions questions, boolean resultat) {
        this.id = id;
        Text = text;
        this.questions = questions;
        this.resultat = resultat;
    }

    public Reponses() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public boolean isResultat() {
        return resultat;
    }

    public void setResultat(boolean resultat) {
        this.resultat = resultat;
    }

    public boolean getResultat() {
        return resultat;
    }

    @OneToMany(mappedBy = "reponses", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuestionReponse> questionReponses;
}

