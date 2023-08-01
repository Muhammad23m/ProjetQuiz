package com.tpcrud.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 90)
    private String nomQuestion;
    @ManyToOne
    @JoinColumn(name = "id_Quiz", nullable = false)
    private Quiz quiz;

    public Questions(Long id, String nomQuestion, Quiz quiz, List<Reponses> reponses) {
        this.id = id;
        this.nomQuestion = nomQuestion;
        this.quiz = quiz;
        this.reponses = reponses;
    }

    public Questions() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomQuestion() {
        return nomQuestion;
    }

    public void setNomQuestion(String nomQuestion) {
        this.nomQuestion = nomQuestion;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public List<Reponses> getReponses() {
        return reponses;
    }

    public void setReponses(List<Reponses> reponses) {
        this.reponses = reponses;
    }

    @OneToMany(mappedBy = "questions", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("questions")
    //@JsonIgnore
    private List<Reponses> reponses;
}
