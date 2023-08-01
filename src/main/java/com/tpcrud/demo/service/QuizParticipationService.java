package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.QuizParticipation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface QuizParticipationService {
    List<QuizParticipation> getAllQuizParticipations();
    Optional<QuizParticipation> getQuizParticipationById(Long id);
    QuizParticipation saveQuizParticipation(QuizParticipation quizParticipation);
    void deleteQuizParticipation(Long id);
    QuizParticipation participateQuiz(QuizParticipation quizParticipation);
    QuizParticipation submitQuizResponses(QuizParticipation quizParticipation);

}
