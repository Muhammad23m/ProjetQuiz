package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.QuestionReponse;
import com.tpcrud.demo.modele.QuizParticipation;
import com.tpcrud.demo.repository.QuizParticipationRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
@AllArgsConstructor
public class QuizParticipationServiceImp implements QuizParticipationService{
    private final QuizParticipationRepository quizParticipationRepository;

    @Override
    public List<QuizParticipation> getAllQuizParticipations() {
        return quizParticipationRepository.findAll();
    }

    @Override
    public Optional<QuizParticipation> getQuizParticipationById(Long id) {
        return quizParticipationRepository.findById(id);
    }

    @Override
    public QuizParticipation saveQuizParticipation(QuizParticipation quizParticipation) {
        return quizParticipationRepository.save(quizParticipation);
    }

    @Override
    public void deleteQuizParticipation(Long id) {
        quizParticipationRepository.deleteById(id);
    }

    @Override
    public QuizParticipation participateQuiz(QuizParticipation quizParticipation) {
        return quizParticipationRepository.save(quizParticipation);
    }

    @Override
    public QuizParticipation submitQuizResponses(QuizParticipation quizParticipation) {
        // Logique pour calculer le score en comparant les réponses avec les réponses correctes
        // et mettre à jour le score dans l'objet quizParticipation
        int score = calculateScore(quizParticipation);
        quizParticipation.setScore(score);

        return quizParticipationRepository.save(quizParticipation);
    }

    // Méthode privée pour calculer le score
    private int calculateScore(QuizParticipation quizParticipation) {
        int score = 0;

        for (QuestionReponse questionReponse : quizParticipation.getQuestionReponse()) {
            // Logique pour comparer la réponse sélectionnée avec la réponse correcte et mettre à jour le score
            if (questionReponse.getReponse().isResultat()) {
                score+=5;
            }
        }

        return score;
    }
}
