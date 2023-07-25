package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.Quiz;
import com.tpcrud.demo.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuizServiceImp implements QuizService{
    private final QuizRepository quizRepository;

    public QuizServiceImp(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz creer(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> lire() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz modifier(long id, Quiz quiz) {
        return quizRepository.findById(id)
                .map(qu -> {
                    qu.setNomQuiz(quiz.getNomQuiz());
                    qu.setCatQuiz(quiz.getCatQuiz());
                    return quizRepository.save(qu);
                }).orElseThrow(() -> new RuntimeException(("Quiz non trouvé")));
    }


    @Override
    public String supprimer(long id) {
        quizRepository.deleteById(id);
        return "Quiz supprimer";
    }
}
