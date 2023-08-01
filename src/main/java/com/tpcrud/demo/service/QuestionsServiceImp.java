package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.Questions;
import com.tpcrud.demo.repository.QuestionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionsServiceImp implements QuestionsService{

    private final QuestionsRepository questionsRepository;

    public QuestionsServiceImp(QuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;
    }
    @Override
    public Questions creer(Questions questions) {
        return questionsRepository.save(questions);
    }

    @Override
    public List<Questions> lire() {
        return questionsRepository.findAll();
    }

    @Override
    public Questions modifier(long id, Questions questions) {
        return questionsRepository.findById(id)
                .map(q -> {
                    q.setNomQuestion(questions.getNomQuestion());
                    return questionsRepository.save(q);
                }).orElseThrow(() -> new RuntimeException(("Quiz non trouvé")));
    }

    @Override
    public String supprimer(long id) {
        questionsRepository.deleteById(id);
        return "Questions supprimée";
    }
}
