package com.tpcrud.demo.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class QuestionReponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "questions_id")
    private Questions question;

    @ManyToOne
    @JoinColumn(name = "reponses_id")
    private Reponses reponse;

    @ManyToOne
    @JoinColumn(name = "QuizParticipation")
    private QuizParticipation quizParticipation;

}
