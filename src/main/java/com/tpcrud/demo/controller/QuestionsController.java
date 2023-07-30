package com.tpcrud.demo.controller;

import com.tpcrud.demo.modele.Questions;
import com.tpcrud.demo.service.QuestionsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
@AllArgsConstructor
public class QuestionsController {

    private final QuestionsService questionsService;
    /**
     * Crée une nouvelle question.
     * @param questions La question à créer.
     * @return La question créée.
     */
    @PostMapping("/create")
    public Questions create(@RequestBody Questions questions){
        return questionsService.creer(questions);
    }
    /**
     * Lit toutes les questions.
     * @return Une liste de toutes les questions.
     */
    @GetMapping("/read")
    public List<Questions> read(){
        return questionsService.lire();
    }
    /**
     * Met à jour une question avec l'ID donné.
     * @param id L'ID de la question à mettre à jour.
     * @param questions La question avec les données mises à jour.
     * @return La question mise à jour.
     */
    @PutMapping("/update/{id}")
    public Questions update(@PathVariable long id,@RequestBody Questions questions){
        return questionsService.modifier(id,questions);
    }
    /**
     * Supprime une question avec l'ID donné.
     * @param id L'ID de la question à supprimer.
     * @return Une chaîne indiquant le succès de la suppression.
     */
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        return questionsService.supprimer(id);
    }

}
