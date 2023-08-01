package com.tpcrud.demo.controller;

import com.tpcrud.demo.modele.QuizParticipation;
import com.tpcrud.demo.service.QuizParticipationService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/quiz-participation")
public class QuizParticipationController {
    private final QuizParticipationService quizParticipationService;


    @GetMapping
    public List<QuizParticipation> getAllQuizParticipation() {
        return quizParticipationService.getAllQuizParticipations();
    }

    @GetMapping("/{id}")
    public QuizParticipation getQuizParticipationById(@PathVariable Long id) {
        return quizParticipationService.getQuizParticipationById(id)
                .orElseThrow(() -> new EntityNotFoundException("QuizParticipation with id " + id + " not found."));
    }

    @PostMapping("/participate")
    public QuizParticipation participateQuiz(@RequestBody QuizParticipation quizParticipation) {
        return quizParticipationService.participateQuiz(quizParticipation);
    }

    @PostMapping("/submit")
    public QuizParticipation submitQuizResponses(@RequestBody QuizParticipation quizParticipation) {
        return quizParticipationService.submitQuizResponses(quizParticipation);
    }

    @PutMapping("/{id}")
    public QuizParticipation updateQuizParticipation(@PathVariable Long id, @RequestBody QuizParticipation quizParticipation) {
        // Vérifier si la participation avec l'ID donné existe
        QuizParticipation existingParticipation = quizParticipationService.getQuizParticipationById(id)
                .orElseThrow(() -> new EntityNotFoundException("QuizParticipation with id " + id + " not found."));

        // Mettre à jour les autres attributs de la participation en fonction des données envoyées dans le corps de la requête
        existingParticipation.setScore(quizParticipation.getScore());
        // Mettre à jour d'autres attributs selon votre modèle QuizParticipation

        // Enregistrer les mises à jour
        return quizParticipationService.saveQuizParticipation(existingParticipation);
    }

    @DeleteMapping("/{id}")
    public void deleteQuizParticipation(@PathVariable Long id) {
        quizParticipationService.deleteQuizParticipation(id);
    }
}


