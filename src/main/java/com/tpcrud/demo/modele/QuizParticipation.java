package com.tpcrud.demo.modele;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "quiz_participation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizParticipation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_participation")
    private Long idParticipation;

    @Column(name = "score")
    private int score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_quiz")
    private Quiz quiz;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;
    @OneToMany(mappedBy = "quizParticipation", cascade = CascadeType.ALL)
    private List<QuestionReponse> questionReponse;



}

