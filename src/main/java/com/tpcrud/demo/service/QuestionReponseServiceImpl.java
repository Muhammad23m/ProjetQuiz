package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.QuestionReponse;
import com.tpcrud.demo.repository.QuestionReponseRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class QuestionReponseServiceImpl implements QuestionReponseService{
   private final QuestionReponseRepository questionReponseRepository;
    @Override
    public List<QuestionReponse> getAllQuestionReponse() {
        return questionReponseRepository.findAll();
    }

    @Override
    public QuestionReponse getQuestionReponseById(Long id) {
        return questionReponseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("QuestionReponse with id " + id + " not found."));
    }

    @Override
    public void saveQuestionReponse(QuestionReponse questionReponse) {
        questionReponseRepository.save(questionReponse);
    }

    @Override
    public void deleteQuestionReponse(Long id) {
        questionReponseRepository.deleteById(id);
    }
}
