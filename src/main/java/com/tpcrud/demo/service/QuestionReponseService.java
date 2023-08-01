package com.tpcrud.demo.service;

import com.tpcrud.demo.modele.QuestionReponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuestionReponseService {
    List<QuestionReponse> getAllQuestionReponse();
    QuestionReponse getQuestionReponseById(Long id);
    void saveQuestionReponse(QuestionReponse questionReponse);
    void deleteQuestionReponse(Long id);
}
