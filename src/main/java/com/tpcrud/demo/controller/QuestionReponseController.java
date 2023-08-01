package com.tpcrud.demo.controller;

import com.tpcrud.demo.modele.QuestionReponse;
import com.tpcrud.demo.service.QuestionReponseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

@RequestMapping("/QuestionReponse")
public class QuestionReponseController {

    private final QuestionReponseService questionReponseService;

    @GetMapping("/read")
    public List<QuestionReponse> getAllQuestionReponse() {
        return questionReponseService.getAllQuestionReponse();
    }

    @GetMapping("read/{id}")
    public QuestionReponse getQuestionReponseById(@PathVariable Long id) {
        return questionReponseService.getQuestionReponseById(id);
    }

    @PostMapping("/create")
    public void saveQuestionReponse(@RequestBody QuestionReponse questionReponse) {
        questionReponseService.saveQuestionReponse(questionReponse);
    }

    @DeleteMapping("delete/{id}")
    public void deleteQuestionReponse(@PathVariable Long id) {
        questionReponseService.deleteQuestionReponse(id);
    }
}
